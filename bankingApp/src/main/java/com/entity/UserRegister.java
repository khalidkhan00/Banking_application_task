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
	private String UserName;
	private String Email;
	private String Password;
	@Override
	public String toString() {
		return "UserRegister [UserName=" + UserName + ", Email=" + Email + ", Password=" + Password + "]";
	}
	public UserRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRegister(String userName, String email, String password) {
		super();
		UserName = userName;
		Email = email;
		Password = password;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
