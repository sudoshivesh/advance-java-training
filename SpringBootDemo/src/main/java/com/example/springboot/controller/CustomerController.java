package com.example.springboot.controller;
import java.util.List;

import javax.swing.text.html.parser.Entity;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Customer;
import com.example.springboot.service.CustomerService;
@RestController
@RequestMapping("/example")
public class CustomerController {
	//@Autowired
	private CustomerService custservice;
	private HttpStatusCode HttpStatus;
	@GetMapping(value="/Customer")
	public ResponseEntity<List<Customer>> getallCustomerDetails() throws Exception{
		List<Customer> clist=custservice.getAllCustomerDetails();
		ResponseEntity<List<Customer>> response=new ResponseEntity<List<Customer>>(clist,HttpStatus);
		return response;
	}
	@GetMapping(value="/Customer/{customerId}")
	public ResponseEntity <Customer> getCustomerDetails(@PathVariable Integer customerId) throws Exception{
		Customer cdetails=custservice.getCustomer(customerId);
		ResponseEntity<Customer> response=new ResponseEntity<Customer>(cdetails,HttpStatus);
		return response;
	}
	@PostMapping(value="/Customer/{customerId}")
	public ResponseEntity <String> addCustomer(@RequestBody Customer c)throws Exception{
		custservice.addCustomer(c);
		String msg="Customer Added Successfully";
		ResponseEntity<String> response=new ResponseEntity<String>(msg,HttpStatus);
		return response;
	}
	@PutMapping(value="/Customer/{customerId}")
	public ResponseEntity <String> updateCustomer(@PathVariable Customer c)throws Exception{
		custservice.addCustomer(c);
		String msg="Customer Added Successfully";
		ResponseEntity<String> response=new ResponseEntity<String>(msg,HttpStatus);
		return response;
	}
}
