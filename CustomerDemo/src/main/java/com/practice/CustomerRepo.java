package com.practice;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, String>{
	public Customer findByname(String name);
	public List<Customer> findBynumber(int number);

}