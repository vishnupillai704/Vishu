package com.example.boot.Assignment9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class employee {
	@RequestMapping(value="/employ",method=RequestMethod.GET)
	public String vis() {
		return "employ";
		
	}
	@RequestMapping(value="/employ" ,method=RequestMethod.POST)
	public String vish() {
		return "employ2";

}
	@RequestMapping(value="/employ1" ,method=RequestMethod.POST)
	public String vish1() {
		return "employ3";
}
}