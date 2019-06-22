package com.hcl.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id

	private Long userId;
	private String password;

	public Admin() {
		super();

	}

	public Admin(Long userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
