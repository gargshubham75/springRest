package com.practice.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {

	
	
	@RequestMapping("/authenticate/{username}/{password}")
	public String getMessage(@PathVariable("username") String username, @PathVariable("password") String password) {
		String existingUser = "gargshubham75@gmail.com";
		String piyuPass = "shubham123";
		
		if(username.equals(existingUser) && password.equals(piyuPass)) {
			return "Valid User";
		} else {
			return "Invalid User";
		}
	}
}


