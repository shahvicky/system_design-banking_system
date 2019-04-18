package com.banking.system;

import java.util.HashMap;
import java.util.Map;

import com.banking.system.account.Account;
import com.banking.system.person.Person;

public class Bank {
	Map<Long, Account> accountMap;
	Map<String, Person> customerMap;
	
	public Bank() {
		accountMap = new HashMap<>();
		customerMap = new HashMap<>();
	}
	
	public long addCustomer(String name, String id, String pin) {
		Account acc = new Account(id, pin);
		Person cust = new Person(name, id, acc.getAccount());
		accountMap.put(acc.getAccount(), acc);
		customerMap.put(cust.getIdNum(), cust);
		return acc.getAccount();
	}
	
	public long addCustomer(String name, String id, String pin, double initial) {
		Account acc = new Account(id, pin, initial);
		Person cust = new Person(name, id, acc.getAccount());
		accountMap.put(acc.getAccount(), acc);
		customerMap.put(cust.getIdNum(), cust);
		return acc.getAccount();
	}
	
	public double getBalance(long accId, String custId)throws Exception {
		Person cust = customerMap.get(custId);
		if(cust == null) {
			throw new Exception("No customer with id "+ custId+" found");
		}
		if(cust.getAccountNum() != accId) {
			throw new Exception("Account num does not match");
		}
		return accountMap.get(cust.getAccountNum()).getBalance();
	}
	
	public void debitAccount(long accId, String pin, String custId, double amount)throws Exception {
		Person cust = customerMap.get(custId);
		if(cust == null) {
			throw new Exception("No customer with id "+ custId+" found");
		}
		if(cust.getAccountNum() != accId) {
			throw new Exception("Account num does not match");
		}
		accountMap.get(accId).debit(pin,amount);
	}
	
	public void creditAccount(long accId, String custId, double amount)throws Exception {
		Person cust = customerMap.get(custId);
		if(cust == null) {
			throw new Exception("No customer with id "+ custId+" found");
		}
		if(cust.getAccountNum() != accId) {
			throw new Exception("Account num does not match");
		}
		accountMap.get(accId).credit(amount);
	}
	
}
