package com.example.boot.Assignment5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class employ {
	@RequestMapping(value="/AssignmentQ5",method=RequestMethod.GET)
	public String showwebpage() {
		return "data";
	}
	@RequestMapping(value="/AssignmentQ5",method=RequestMethod.POST)
	public String result(@ModelAttribute("data3") emplo data2) {
		return "data1";
	}
	@RequestMapping(value="/Assignment",method=RequestMethod.POST)
	public String result1(@ModelAttribute("data4") emplo data3) {
		return "data2";
	}
	@RequestMapping(value="/Assignment5",method=RequestMethod.POST)
	public String result2() {
		return "data3";
}
}