package com.example.springboot.service;
import java.util.List;
import com.example.springboot.model.Customer;
public abstract class CustomerService {
	public abstract List<Customer> getAllCustomerDetails() throws Exception;
	public abstract Customer getCustomer(Integer customerId) throws Exception;
	public abstract void addCustomer(Customer c)throws Exception;
	public abstract void updateEmail(int customerId,String customerEmail)throws Exception;
	public abstract void updatePhone(int customerId,String customerPhone)throws Exception;
	public abstract void removeCustomer(int customerId)throws Exception;
	
}
