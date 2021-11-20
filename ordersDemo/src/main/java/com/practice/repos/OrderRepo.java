package com.practice.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practice.model.orders;

public interface OrderRepo extends MongoRepository<orders, Integer> {

}
