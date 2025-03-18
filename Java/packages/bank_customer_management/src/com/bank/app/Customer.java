package com.bank.app;

public class Customer {

	private String customerName;
	private int customerId;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String showCustomerDetails() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + "]";
	}
}
