package zipcode.country.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import zipcode.country.model.zipcodes;



@RestController
public class zips {
	@Autowired  
	private ZipCodesAdding service;  
	@GetMapping("/zips")  
	public List<zipcodes> retriveAllzips()  
	{  
	return service.findAll();  
	}  
	@GetMapping("/zips/{id}")  
	public zipcodes retrivezips(@PathVariable int id)  
	{  
	return service.findOne(id);  
	} 
}
