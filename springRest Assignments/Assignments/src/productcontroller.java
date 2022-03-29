package com.example.mongoQ8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productcontroller {
	@Autowired
	private productservice service;
	@RequestMapping(value="/product")
	public List<product>getAllProduct(){
		return service.getAllProduct();
	}
	
	@RequestMapping(value="/product/{id}")
	public product getProduct(@PathVariable Integer id) {
		return service.getProduct(id);
	}
	@RequestMapping(value="/products",method=RequestMethod.POST)
	   public product addProduct(@RequestBody product prod) {
        return service.addProduct(prod);
    }
	  @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	    public void deleteProduct(@PathVariable Integer id) {
	         service.deleteProduct(id);
	    }
	  @RequestMapping(value = "/products", method = RequestMethod.PUT)
	    public void updateProduct(@RequestBody product prod) {
	         service.update(prod);
	    }
	
	

}
