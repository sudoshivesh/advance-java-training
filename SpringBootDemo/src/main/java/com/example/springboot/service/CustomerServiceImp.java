package com.example.springboot.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springboot.dao.CustomerDao;
import com.example.springboot.dao.CustomerDaoImp;
import com.example.springboot.model.Customer;
public abstract class CustomerServiceImp {
	@Autowired
	private CustomerDaoImp cdimp;
	//@Override
	public List<Customer> getallCustomerDetails() throws Exception{
		List<Customer> clist=cdimp.getallCustomerDetails();
		if(clist==null) {
			throw new Exception("No Customer Avaialble");
		}
		return clist;
	}
	public Customer getCustomer(Integer customerId)throws Exception{
		Customer cdetails=cdimp.getCustomer(customerId);
		if(cdetails==null) {
			throw new Exception("No customer Avaialble with this customerId"+customerId);
		}
		return cdetails;
	}
	public void addCustomer(Customer c)throws Exception{
		if(cdimp.getCustomer(c.getCustomerId())!=null) {
			throw new Exception("Customer already Exist");
		}
	}
	public void updateEmail(int customerId,String customerEmail)throws Exception{
		Customer cdetails=cdimp.getCustomer(customerId);
		if(cdetails==null) {
			throw new Exception("No customer avaialbale with this id"+customerId);
		}
		cdimp.updateEmail(customerId, customerEmail);
	}
	
}
