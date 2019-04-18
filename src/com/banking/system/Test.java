package com.banking.system;
/**
 * Banking System 
 * @author Vivek
 *
 */
public class Test {

	public static void main(String[] args) throws Exception {
		Bank bank = new Bank();
		
		long id1 = bank.addCustomer("Vivek", "Abc123", "1234");
		System.out.println(id1);
		long id2 = bank.addCustomer("Manish", "ABC420", "4321");
		System.out.println(id2);
//		double bal1 = bank.getBalance(id1, "abkjae");
//		System.out.println(bal1);
		double bal2 = bank.getBalance(id2, "ABC420");
		System.out.println(bal2);
		bank.creditAccount(id1, "Abc123", 5000);
		double bal3 = bank.getBalance(id1, "Abc123");
		System.out.println(bal3);
		bank.debitAccount(id1, "1234", "Abc123", 3000);
		double bal4 = bank.getBalance(id1, "Abc123");
		System.out.println(bal4);
		bank.debitAccount(id1, "1234", "Abc123", 3000);
	}

}
