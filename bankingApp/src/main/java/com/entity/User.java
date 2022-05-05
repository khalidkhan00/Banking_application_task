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
	private String lastName;
	private String phone;
	private String address;
	private String accNo;
	private  String accType;
	private String bankName;
	private String ifsccode;
	private int amount;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIFSCcode() {
		return ifsccode;
	}
	public void setIFSCcode(String iFSCcode) {
		ifsccode = iFSCcode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
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
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String Address) {
		address = Address;
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
	public User(int uid, String firstName, String lastName, String phone, String address, String accNo, String accType,
			String bankName, String iFSCcode, int amount) {
		super();
		this.uid = uid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		this.accNo = accNo;
		this.accType = accType;
		this.bankName = bankName;
		this.ifsccode = iFSCcode;
		this.amount = amount;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", firstName=" + firstName + ", LastName=" + lastName + ", phone=" + phone
				+ ", Address=" + address + ", accNo=" + accNo + ", accType=" + accType + ", bankName=" + bankName
				+ ", IFSCcode=" + ifsccode + ", amount=" + amount + "]";
	}
	
	
	
	
	

}
