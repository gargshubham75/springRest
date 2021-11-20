package com.practice.servlet;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import  com.practice.main.UserAuth;

public class Servlet extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources( UserAuth.class);
	}

}
