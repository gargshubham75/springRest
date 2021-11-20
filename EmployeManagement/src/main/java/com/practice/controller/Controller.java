package com.practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.practice.model.Employee;
import com.practice.repo.EmployeeRepo;


public class Controller {

	@Autowired
	private EmployeeRepo erepo;
	
	@PostMapping("/addemp")
	public String savebook(@RequestBody Employee emp) {
		erepo.save(emp);
		return "Added Employee with Id: "+emp.getId();
	}
	@GetMapping("/findallemp")
	public List<Employee>getemps(){
		return erepo.findAll();
	}
	@DeleteMapping("/delete/{id}")
	public String deletebook(@PathVariable int id) {
		erepo.deleteById(id);
		return "Employee Deleted with id :"+id;	
	}
	@GetMapping("/findallemp/{id}")
	public Optional<Employee>getemp(@PathVariable int id){
		return erepo.findById(id);
	}
	

}

