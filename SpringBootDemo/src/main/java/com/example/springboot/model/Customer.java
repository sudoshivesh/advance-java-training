package com.example.springboot.model;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerEmail;
	private int customerPhone;
	public Customer(int customerId,String customerName, String customerEmail,int customerPhone) {
		super();
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerEmail=customerEmail;
		this.customerPhone=customerPhone;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public int getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}

}
