package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Student;
import com.springboot.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudent(Student student) {
	  System.out.println("Studdent in service class "+ student.toString());
	  return studentRepository.save(student);
	}

	public Student updateStudent(Integer stuID, String name, String email, int age, long phoneNo) {
		
		Student student = studentRepository.findById(stuID).get();
		
		
		student.setName(name);
		student.setEmail(email);
		student.setAge(age);
		student.setPhoneNo(phoneNo);
		return studentRepository.save(student);
	}

	public Student getStudent(Integer sID) {
		return studentRepository.findById(sID).get();
	}

	public void deleteStudent(Integer stuID) {
	   studentRepository.deleteById(stuID);
	}
	
	public List<Student> findByAgeIsGreaterThan(int age) {
		return studentRepository.findByAgeIsGreaterThan(age);
	}

	public void updateName(Integer id ,String name) {
		Student student = studentRepository.findById(id).get();
		student.setName(name);
		studentRepository.save(student);
	}
	
}
