package com.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public Customer create(String name, String address , int number) {
		return customerRepo.save(new Customer(name, address, number));
	}
	public List<Customer> getAll(){
		return customerRepo.findAll();
	}
	public Customer getByname(String name) {
		return customerRepo.findByname(name);
	}
	public Customer update(String name, String address, int number) {
		Customer c= customerRepo.findByname(name);
		c.setAddress(address);
		c.setNumber(number);
		return customerRepo.save(c);
		
		
	}
	
	public void deleteAll() {
		customerRepo.deleteAll();
	}
	public void delete(String name) {
		Customer c=customerRepo.findByname(name);
		customerRepo.delete(c);
	}

}