package com.csit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit.demo.dto.StudentDto;
import com.csit.demo.entity.Student;
import com.csit.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public void saveStudent(StudentDto studentDto) {
		Student s = new Student();
		s.setCourse(studentDto.getCourse());
		s.setName(studentDto.getName());
		s.setSemester(studentDto.getSemester());
		studentRepository.save(s);
	}

	public List<Student> getStudent() {
		return studentRepository.findAll();
	}

	public StudentDto getStudent(Long studentId) {
		Student student = studentRepository.getOne(studentId);
		StudentDto dto = new StudentDto();
		dto.setId(student.getId());
		dto.setCourse(student.getCourse());
		dto.setName(student.getName());
		dto.setSemester(student.getSemester());
		return dto;
	}

}
