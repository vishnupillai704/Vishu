package com.example.boot.Rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentQ1 {
	
	@RequestMapping(value="/Assignment",method=RequestMethod.GET)
	public String hello() {
		return "Hello World";
	}

}
