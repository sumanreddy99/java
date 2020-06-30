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
@Table(name = "USER_DETAILS")
public class UserDetails {
	
@Id@GeneratedValue(strategy = GenerationType.AUTO)

@Column(name = "USER_ID")
private int userId;

@Column(name="USER_NAME")
private String userName;

@OneToMany(cascade = CascadeType.PERSIST)
@JoinTable(name = "USERDETAILS_VECHILE",joinColumns = @JoinColumn(name="USER_ID"),inverseJoinColumns = @JoinColumn(name  = "VECHILE_ID"))
private Collection<Vechile> vechile=new ArrayList<Vechile>();





public Collection<Vechile> getVechile() {
	return vechile;
}

public void setVechile(Collection<Vechile> vechile) {
	this.vechile = vechile;
}

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
