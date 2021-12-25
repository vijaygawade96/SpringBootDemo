package com.sb.demoapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.demoapp.model.Student;

@RestController
public class StudentController {
	@GetMapping(path = "/student1")
	public Student getStud1Details() {
		return new Student("Vijay", "Gawade");
	}
	
	@GetMapping(path = "/students")
	public List<Student> getAllStudents(){
		List<Student> students =new ArrayList<Student>();
		students.add(new Student("Vijay","Gawade"));
		students.add(new Student("Prakash","Sawant"));
		students.add(new Student("Rohit","Rawool"));
		students.add(new Student("Amit","Bagaitkar"));
		students.add(new Student("Varsha","Naik"));
		
		return students;
	}
}
