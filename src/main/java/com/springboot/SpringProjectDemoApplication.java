package com.springboot;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import com.springboot.service.StudentService;

@SpringBootApplication
public class SpringProjectDemoApplication implements CommandLineRunner {

	@Autowired
	private StudentService studentService;
	
//	@Autowired
//	private BooksRepository repository;
	
//	
//	public List<Book> findAuthor(String author) {
//	   List<com.springboot.model.Book> author2 = repository.getAuthor(author);
//	   for (Book book : author2) {
//		System.out.println(book);
//	}
//	return null;
//		
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProjectDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
	

}
