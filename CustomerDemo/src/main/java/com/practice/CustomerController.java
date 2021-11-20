package com.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String name, @RequestParam String address, @RequestParam int number) {
		Customer c= customerService.create(name, address, number);
		return c.toString();
	}
	
	@RequestMapping("/get")
	public Customer getPerson(@RequestParam String name) {
		return customerService.getByname(name);
	}
	
	@RequestMapping("/getAll")
	public List<Customer> getAll(){
		return customerService.getAll();
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam String name, @RequestParam String address, @RequestParam int number) {
		Customer c=customerService.update(name,address,number);
		return c.toString();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String name) {
		return "Deleted"+name;
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		customerService.deleteAll();
		return "Deleted all records";
	}
	
	

}