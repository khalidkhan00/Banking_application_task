package com.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
	
	@Id
	@GeneratedValue
	private int uid;
	private String firstName;
	private String LastName;
	
	private String phone;
	private String Address;
	
	private String accNo;
	private  String accType;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public User(int uid, String firstName, String lastName, String phone, String address, String accNo,
			String accType) {
		super();
		this.uid = uid;
		this.firstName = firstName;
		LastName = lastName;
		this.phone = phone;
		Address = address;
		this.accNo = accNo;
		this.accType = accType;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", firstName=" + firstName + ", LastName=" + LastName + ", phone=" + phone
				+ ", Address=" + Address + ", accNo=" + accNo + ", accType=" + accType + "]";
	}
	
	
	
	
	

}
