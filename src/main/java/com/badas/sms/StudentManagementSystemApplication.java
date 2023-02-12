package com.badas.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.badas.sms.entity.Student;
import com.badas.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
//		Student student1 = new Student("Badas", "Badaró", "badas@badmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Gabriel", "Badaró", "gabriel@gabmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Gabrile", "Badaor", "gabrile@bilemail.com");
//		studentRepository.save(student3);
//		
//		
	}

}
