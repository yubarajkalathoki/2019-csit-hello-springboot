package com.csit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csit.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
