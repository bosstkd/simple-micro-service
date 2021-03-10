package com.microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.models.MeteoModel;

@Repository
public interface MeteoRepository extends MongoRepository<MeteoModel, String>{

}
