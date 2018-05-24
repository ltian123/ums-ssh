package dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.GenericDao;

@Repository
public abstract class GenericDaoImpl<E extends Serializable,PK extends Serializable> implements GenericDao<E, PK> {
	
	@Autowired
	protected SessionFactory sessionFactory;
	protected Class<E> entityClass;
	
	public GenericDaoImpl() {
		entityClass=(Class<E>) ((ParameterizedType)(this.getClass()
										                .getGenericSuperclass()))
										           .getActualTypeArguments()[0];
	}

	public void insert(E e) {
		Session session=sessionFactory.getCurrentSession();
		session.save(e);
	}

	public void deleteById(PK id) {
		Session session=sessionFactory.getCurrentSession();		
		session.delete(session.get(entityClass, id));
	}

	public void delete(E e) {
		Session session=sessionFactory.getCurrentSession();		
		session.delete(e);
	}

	public void update(E e) {
		Session session=sessionFactory.getCurrentSession();		
		session.update(e);
	}

	public E selectById(PK id) {
		Session session=sessionFactory.getCurrentSession();		
		return (E) session.get(entityClass, id);
	}

	public List<E> selectAll() {
		Session session=sessionFactory.getCurrentSession();
		return session.createCriteria(entityClass)
					  .list();
	}

}
