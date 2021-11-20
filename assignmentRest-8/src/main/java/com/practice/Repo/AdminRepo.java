package com.practice.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practice.model.admin;

public interface AdminRepo extends MongoRepository<admin,Integer> {

}