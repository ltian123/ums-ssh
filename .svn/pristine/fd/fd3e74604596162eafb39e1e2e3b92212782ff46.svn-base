package entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_user")

public class User  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String username;
     private String password;
     private String phone;
     private Date createDate;
     private String status;


    // Constructors

    /** default constructor */
    public User() {
    }

    
    /** full constructor */
    public User(String username, String password, String phone, Date createDate, String status) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.createDate = createDate;
        this.status = status;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="username", length=10,updatable=false)

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Column(name="password", length=50)

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="phone", length=20)

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="create_date", length=10,updatable=false)

    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    @Column(name="status", length=3)

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
   








}