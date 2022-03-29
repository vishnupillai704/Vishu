package com.example.boot.RestassignmentQ6;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {
	@RequestMapping(value="/addition/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b) {
		return a+b;
	}
	@RequestMapping(value="/subtract/{a}/{b}")
	public int subtract(@PathVariable int a,@PathVariable int b) {
		return a-b;
	}
	@RequestMapping(value="/multiply/{a}/{b}")
	public int multiplication(@PathVariable int a,@PathVariable int b) {
		return a*b;
	}
	@RequestMapping(value="/division/{a}/{b}")
	public int division(@PathVariable int a,@PathVariable int b) {
		return a/b;
	}
	@RequestMapping(value="/sqrt/{a}")
	public double squareroot(@PathVariable int a) {
		return Math.sqrt(a);
	}
	

}
