package com.csit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csit.demo.entity.Student;
import com.csit.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/save-student")
	public void save() {
		studentService.saveStudent();
	}
	
	@GetMapping(value="/get-student", produces="application/json")
	public  List<Student> getStudent() {
		return studentService.getStudent();
	}
}
