package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userregister_table")
public class UserRegister {

	@Id
	@GeneratedValue
	private int regid;
	private String userName;
	private String email;
	private String password;
	@Override
	public String toString() {
		return "UserRegister [UserName=" + userName + ", Email=" + email + ", Password=" + password + "]";
	}
	public UserRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRegister(String userName, String email, String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
