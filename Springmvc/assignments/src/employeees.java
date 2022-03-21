package com.example.boot.Assignment10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class employeees {
	@RequestMapping(value="/Assignment9",method=RequestMethod.GET)
	public String vis() {
		return "index";
	}
	@RequestMapping(value="/Assignment9-1",method=RequestMethod.POST)
	public String vish() {
		return "assignment10";
	}
}
