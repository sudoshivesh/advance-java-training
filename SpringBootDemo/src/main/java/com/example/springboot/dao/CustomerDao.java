package com.example.springboot.dao;
import java.util.*;
import com.example.springboot.model.Customer;
public abstract class CustomerDao implements CustomerDaoImp {
	private Map<Integer,Customer> customers=new HashMap<Integer,Customer>();
	public CustomerDao() {
		customers.put(103,new Customer(103,"Shivesh","helloshiveshraazzput@gmail.com",201306));
		customers.put(169, new Customer(169,"Bunny","heybunny@hotmail.com",842456));
	}
	@Override
	public List<Customer> getallCustomerDetails(){
		return new ArrayList<Customer>(customers.values());
	}
	@Override
	public Customer getCustomer(int customerId) {
		return customers.get(customerId);
	}
	@Override
	public void addCustomer(Customer customer) {
		customers.put(customer.getCustomerId(),customer);
	}
	@Override
	public void updateEmail(int customerId, String customerEmail) {
		customers.get(customerId).setCustomerEmail(customerEmail);
	}
	@Override
	public void updatePhone(int customerId, int customerPhone) {
		customers.get(customerId).setCustomerPhone(customerPhone);
	}
	@Override
	public void removeCustomer(int customerId) {
		customers.remove(customerId);
	}
	
}
