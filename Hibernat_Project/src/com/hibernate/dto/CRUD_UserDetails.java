package com.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@NamedQuery(name = "CRUD_UserDetails.userId",query = "from CRUD_UserDetails where userId= ?")
//@NamedNativeQuery(name = "CRUD_UserDetails.byName",query = "select * from CRUD_USER_DETAILS where CRUD_USER_ID = ?",resultClass =CRUD_UserDetails.class )
@Table(name = "CRUD_USER_DETAILS")
public class CRUD_UserDetails {
	
@Id@GeneratedValue(strategy = GenerationType.AUTO)

@Column(name = "CRUD_USER_ID")
private int userId;

@Column(name="CRUD_USER_NAME")
private String userName;


public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}




}
