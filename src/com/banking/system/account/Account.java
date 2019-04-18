package com.banking.system.account;

public class Account {
	private long accountNum;
	private static long accId;
	private String pin;
	private String idNum;
	private double balance;
	
	public Account(String idNum, String pin) {
		setAccountNum(accId++);
		this.idNum = idNum;
		this.pin = pin;
	}
	
	public Account(String idNum, String pin, double initialDeposit) {
		setAccountNum(accId++);
		this.idNum = idNum;
		this.balance = initialDeposit;
		this.pin = pin;
	}
	
	private void setAccountNum(long id) {
		this.accountNum = id;
	}
	public long getAccount() {
		return this.accountNum;
	}
	public void debit(String pin, double amount) throws Exception{
		if(!this.pin.equals(pin)) {
			throw new Exception("Pin Mismatch");
		}
		if(amount > this.balance) {
			throw new Exception("Cannot debit more than balance");
		}
		this.balance -= amount;
	}
	
	public void credit(double amount) {
		this.balance += amount;
	}
	public double getBalance() {
		return this.balance;
	}
	public void resetPin(String id, String pin) throws Exception {
		if(id != this.idNum) {
			throw new Exception("Identification failed");
		}
		this.pin = pin;
	}
}
