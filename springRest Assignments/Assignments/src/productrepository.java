package com.example.mongoQ8;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
@Component
public interface productrepository extends MongoRepository<product,Integer>{

}
