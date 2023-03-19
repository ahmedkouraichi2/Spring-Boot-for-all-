package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Student;

public class DBStudentService  implements StudentService{

	private final StudentRepository repository ;
	
	public DBStudentService( StudentRepository repository ) {
		 this.repository = repository ;
	}
	@Override
	public Student save(Student s) {
		 return repository.save(s) ;
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return  repository.findAll();
	}

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return repository.findByEmail(email);
	}

	@Override
	public Student update(Student s) {
		// TODO Auto-generated method stub
		return repository.save(s);
	}

	@Override
	public void  delete(String email) {
		// TODO Auto-generated method stub*
		
	repository.deleteByEmail(email);
		
	}

}
