package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Student;


public interface StudentService {
	Student save(Student s) ;
	List<Student> findAllStudents();
	Student findByEmail(String email);
	Student update(Student s) ;
	void delete (String email);
	
	

}
