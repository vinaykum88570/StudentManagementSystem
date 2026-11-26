package com.springboot.Controller;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Student;
import com.springboot.service.StudentService;

@RestController
@RequestMapping


public class StudentController {

	@Autowired
	private StudentService studentService;

	
	
	
	
	@PostMapping("/add")
	public Student saveData(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@PutMapping("/update/{id}/{name}/{email}/{age}/{phoneNo}")
	public Student update(@PathVariable Integer id,
			              @PathVariable String name,
						  @PathVariable String email,
						  @PathVariable int age,
						  @PathVariable long phoneNo) {
											
		return studentService.updateStudent(id,name,email,age,phoneNo);
		
	}
	
	@GetMapping("/get/{sID}")
	public Student getStudent(@PathVariable Integer sID) {
		return studentService.getStudent(sID);
	}
	
	
	@DeleteMapping("/delete/{stuID}") 
	public void deleteStudent(@PathVariable Integer stuID) {
		studentService.deleteStudent(stuID);
	}
	
	@PatchMapping("/update/{name}/{id}")
	public void updateName(@RequestParam String name,
			@PathVariable Integer id) {
		studentService.updateName(id,name);
	}
	
	
}
