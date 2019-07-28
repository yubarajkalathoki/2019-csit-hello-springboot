package com.csit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit.demo.entity.Student;
import com.csit.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public void saveStudent() {
		Student s = new Student();
		s.setCourse("CSIT");
		s.setName("Aashish");
		s.setSemester("Fourth");
		studentRepository.save(s);
	}

	public List<Student> getStudent() {
		return studentRepository.findAll();
	}

}
