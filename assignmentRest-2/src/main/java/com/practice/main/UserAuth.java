package com.practice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class UserAuth {


	public static void main(String[] args) {
		SpringApplication.run( UserAuth.class, args);
		System.out.println("App Started..");
	}

}
