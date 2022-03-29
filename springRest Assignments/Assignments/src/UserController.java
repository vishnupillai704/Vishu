package com.example.boot.Rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private User service;
    @RequestMapping(value="/AssignmentQ2/{username}/{password}",method=RequestMethod.GET)
	public ResponseEntity<Boolean>checkdata(@PathVariable String username,@PathVariable String password) {
		boolean vis= service.checkdata(username,password);
		if(!vis) {
			return new ResponseEntity<Boolean>(false,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
}
