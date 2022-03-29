package com.example.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
@Component
public interface orderRepository extends MongoRepository<orders, Integer> {

	orders findByItem(String item);

}
