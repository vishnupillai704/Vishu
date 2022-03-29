package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="/employee")
public class employeeController {
	@Autowired
	private Employeejparepository employeejparepository;
	
    @RequestMapping(value="/all")
	public List<employee>findAll(){
		return employeejparepository.findAll();
	}
	@RequestMapping(value="/{employeename}")
	public employee findByEmployeename(@PathVariable String employeename) {
		return employeejparepository.findByEmployeename(employeename);
	
	}
	@RequestMapping(value="/load",method=RequestMethod.POST)
		public employee load(@RequestBody employee employ) {
		employeejparepository.save(employ);
		return employeejparepository.findByEmployeename(employ.getEmployeename());
		}
	@RequestMapping(value="/delete/{employeeid}",method=RequestMethod.DELETE)
	public void delete(@PathVariable Long employeeid) {
	     employeejparepository.deleteById(employeeid);
	}
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public void update(@RequestBody employee employ) {
	     employeejparepository.save(employ);
	}
	
	

}
