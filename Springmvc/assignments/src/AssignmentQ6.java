package com.example.boot.web;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;



@Controller
public class AssignmentQ6 {
    @RequestMapping(value="/Assignment6",method=RequestMethod.GET)
	public String showpage() {
		return "registration";
	}
}

