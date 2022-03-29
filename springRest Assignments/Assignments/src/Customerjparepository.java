package com.example.demo.AssignmentQ9;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface Customerjparepository extends CrudRepository<customer, Integer> {

	customer findByName(String name);

}
