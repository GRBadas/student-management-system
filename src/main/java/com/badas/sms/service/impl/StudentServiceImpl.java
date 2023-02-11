package com.badas.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.badas.sms.entity.Student;
import com.badas.sms.repository.StudentRepository;
import com.badas.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	

}
