package com.example.onlinelearningplatform.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Course {

	@GetMapping("/")
	public String helloWorld(){
		return "Hello";
	}
}