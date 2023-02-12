package com.badas.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.badas.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}