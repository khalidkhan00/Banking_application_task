package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {
	 
	@Id
	@GeneratedValue
	private int transactId;
	private String fromAcc;
	private String toAcc;
	private String bankName;
	private String IFSCcode;
	private int amount;
	
	public long getTransactId() {
		return transactId;
	}
	public void setTransactId(int transactId) {
		this.transactId = transactId;
	}
	public String getFromAcc() {
		return fromAcc;
	}
	public void setFromAcc(String fromAcc) {
		this.fromAcc = fromAcc;
	}
	public String getToAcc() {
		return toAcc;
	}
	public void setToAcc(String toAcc) {
		this.toAcc = toAcc;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIFSCcode() {
		return IFSCcode;
	}
	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Transaction(int transactId, String fromAcc, String toAcc, String bankName, String iFSCcode, int amount) {
		super();
		this.transactId = transactId;
		this.fromAcc = fromAcc;
		this.toAcc = toAcc;
		this.bankName = bankName;
		IFSCcode = iFSCcode;
		this.amount = amount;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Transaction [transactId=" + transactId + ", fromAcc=" + fromAcc + ", toAcc=" + toAcc + ", bankName="
				+ bankName + ", IFSCcode=" + IFSCcode + ", amount=" + amount + "]";
	}
	
	

}
