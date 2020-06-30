package com.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PER_TO_DET_USER_DETAILS")
@org.hibernate.annotations.Entity(selectBeforeUpdate = true)
public class Persistent_To_Detached_UserDetails {
	
@Id@GeneratedValue(strategy = GenerationType.AUTO)

@Column(name = "PER_TO_DET_USER_ID")
private int userId;

@Column(name="PER_TO_DET__USER_NAME")
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
