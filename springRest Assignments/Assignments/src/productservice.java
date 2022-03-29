package com.example.mongoQ8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class productservice {
	@Autowired
	private productrepository repository;
	 
	public List<product> getAllProduct(){
		return repository.findAll();
	}
	public product getProduct(Integer id) {
		return repository.findById(id).get();
	}
	public product addProduct(product prod) {
		return repository.insert(prod);
	}
	public void deleteProduct(Integer id) {
		 repository.deleteById(id);
	}
	public void update(product prod) {
		repository.save(prod);
	}

}
