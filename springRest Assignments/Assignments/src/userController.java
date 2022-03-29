package com.example.boot.RestassignmentQ3;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
	
	@RequestMapping(value="/AssignmentQ3/{zipcode}")
	public ResponseEntity<String> check(@PathVariable String zipcode) {
		if(zipcode.equals("201005")) {
			return new ResponseEntity<String>("{State:uttar pradesh,city:ghaziabad,country:india}",HttpStatus.OK);
		}
		else if(zipcode.equals("897979")) {
			return new ResponseEntity<String>("{State:winden,city:dark,country:germany",HttpStatus.OK);
		}
		else if(zipcode.equals("897474")) {
			return new ResponseEntity<String>("{State:hogwarts,city:london,country:England",HttpStatus.OK);
		}
		 return new ResponseEntity<String>("false",HttpStatus.NOT_FOUND);
	}
}
