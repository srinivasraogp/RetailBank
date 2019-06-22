package com.hcl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long userId;
private String password;
public Admin() {
	
}
public long getUserId() {
	return userId;
}
public String getPassword() {
	return password;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public void setPassword(String password) {
	this.password = password;
}
public Admin(long userId, String password) {
	super();
	this.userId = userId;
	this.password = password;
}
}
