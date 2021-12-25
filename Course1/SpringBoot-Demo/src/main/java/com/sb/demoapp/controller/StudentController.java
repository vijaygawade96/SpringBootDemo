package com.sb.demoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.demoapp.model.Student;

@RestController
public class StudentController {
	@GetMapping(path = "/student1")
	public Student getStud1Details() {
		return new Student("Vijay", "Gawade");
	}
}
