package com.example.springboot.dao;
import java.util.List;
import com.example.springboot.model.Customer;
public interface CustomerDaoImp {
	public List<Customer> getallCustomerDetails();
	public Customer getCustomer(int customerId);
	public void addCustomer(Customer c);
	public void updateEmail(int customerId,String customerEmail);
	public void updatePhone(int customerId,int customerPhone);
	public void removeCustomer(int customerId);
}
