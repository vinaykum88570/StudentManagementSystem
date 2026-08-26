package com.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	
	public List<Student> findByAgeIsGreaterThan(int age);
	
	

}
