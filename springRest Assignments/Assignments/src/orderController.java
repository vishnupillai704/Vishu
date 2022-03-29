package com.example.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;









@RestController
public class orderController {
	@Autowired
	private orderRepository order;
	@RequestMapping(value="/all")
	public List<orders>findAll(){
		return order.findAll();
	}
	@RequestMapping(value="/{item}")
	public orders findByEmployeename(@PathVariable String item) {
		return order.findByItem(item);
	
	}
	@RequestMapping(value="/load",method=RequestMethod.POST)
	public orders load(@RequestBody orders ord) {
	order.save(ord);
	return order.findByItem(ord.getItem());
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {
	     order.deleteById(id);
	}
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public void update(@RequestBody  orders ord) {
	     order.save(ord);
	}

}
