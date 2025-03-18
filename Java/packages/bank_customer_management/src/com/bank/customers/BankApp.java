package com.bank.customers;

import java.beans.Customizer;

import com.bank.accounts.*;
import com.bank.app.Customer;
import com.bank.customers.*;

public class BankApp {

	public static void main(String[] args) {
		BankAccount ba= new BankAccount();
		ba.setBalance(18000);
		ba.setBankAccount("Savings Account");
		
		Customer cs= new Customer();
		cs.setCustomerId(666);
		cs.setCustomerName("Guru Subhash");
		
		System.out.println(ba.showAccountDetails());
		System.out.println("---------------------------------------------");
		System.out.println(cs.showCustomerDetails());
	}
}
