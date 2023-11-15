package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
public class studentPathVariable {
	
	@GetMapping("/student/{firstname}/{lastname}")
	//http://localhost:8080/student/yeshwanth/kumar
	
	public Student getstudentpathvarible(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname)
	{
		return new Student(firstname,lastname);
		
	}

}
