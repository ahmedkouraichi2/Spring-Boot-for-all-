package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	Student findByEmail(String email);
	void deleteByEmail(String email) ;
	
	
}
