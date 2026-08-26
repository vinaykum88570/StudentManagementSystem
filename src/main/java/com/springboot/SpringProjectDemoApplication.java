package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.model.Student;
import com.springboot.service.StudentService;

@SpringBootApplication
public class SpringProjectDemoApplication implements CommandLineRunner {

	@Autowired
	private StudentService studentService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProjectDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//	Student stu = new Student();
//	stu.setAge(15);
//	stu.setName("Kaka");
//	stu.setPhoneNo(7777782732L);
//	stu.setEmail("kaka@gmail.com");	
//	studentService.saveStudent(stu);
	
//	Student student = studentService.getStudent(2);
////	System.out.println(student);
//	
//	
//	List<Student> stude = studentService.findByAgeIsGreaterThan(18);
//	stude.stream().forEach(v->System.out.println(v));
	
	
	}
	

}
