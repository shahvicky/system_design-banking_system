package com.banking.system.person;

import java.util.Date;

public class Person {

	long accountNum;
	String name;
	Date dob;
	Address addr;
	String idNum;
	
	public Person(String name, String idNum, long accountId) {
		this.name = name;
		this.idNum = idNum;
		this.accountNum = accountId;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public long getAccountNum() {
		return accountNum;
	}
	public String getIdNum() {
		return idNum;
	}
}
