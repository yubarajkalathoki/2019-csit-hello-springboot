package com.csit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.csit.demo.dto.StudentDto;
import com.csit.demo.entity.Student;
import com.csit.demo.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public void save(@RequestBody StudentDto studentDto) {
		studentService.saveStudent(studentDto);
	}
	
	@GetMapping
	public  List<Student> getStudents() {
		return studentService.getStudent();
	}
	
	@GetMapping("/{id}")
	public  StudentDto getStudent(@PathVariable("id") Long studentId) {
		System.out.println("Student id is "+studentId);
		return studentService.getStudent(studentId);
	}
	
	
}
