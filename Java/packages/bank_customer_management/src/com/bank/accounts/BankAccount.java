package com.bank.accounts;

public class BankAccount {

	private String BankAccount;
	public String getBankAccount() {
		return BankAccount;
	}
	public void setBankAccount(String bankAccount) {
		BankAccount = bankAccount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	private int balance;
	
	public String showAccountDetails() {
		return "BankAccount [BankAccount=" + BankAccount + ", balance=" + balance + "]";
	}
}
