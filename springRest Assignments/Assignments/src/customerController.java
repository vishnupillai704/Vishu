package com.example.demo.AssignmentQ9;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class customerController {
	@Autowired
	private Customerjparepository repository;
	 @RequestMapping(value="/all")
		public Iterable<customer> findAll(){
			return repository.findAll();
		}
		@RequestMapping(value="/{name}")
		public customer findByEmployeename(@PathVariable String name) {
			return repository.findByName(name);
		
		}
		@RequestMapping(value="/load",method=RequestMethod.POST)
		public customer load(@RequestBody customer cust) {
		repository.save(cust);
		return repository.findByName(cust.getName());
		}
		@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
		public void delete(@PathVariable Integer id) {
		     repository.deleteById(id);
		}
		@RequestMapping(value="/update",method=RequestMethod.PUT)
		public void update(@RequestBody customer cust) {
		     repository.save(cust);
		}
		

}
