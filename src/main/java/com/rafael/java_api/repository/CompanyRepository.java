package com.rafael.java_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.rafael.java_api.model.CompanyModel;
import java.util.List;

public interface CompanyRepository extends MongoRepository<CompanyModel, String> {

}
