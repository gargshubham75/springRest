package com.practice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.practice.model.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository <Employee ,  Integer > {

}
