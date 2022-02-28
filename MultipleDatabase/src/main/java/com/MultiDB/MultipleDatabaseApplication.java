
package com.MultiDB;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MultiDB.book.repo.BookRepo;
import com.MultiDB.model.book.Book;
import com.MultiDB.model.user.User;
import com.MultiDB.user.repo.UserRepo;

@SpringBootApplication
@RestController

public class MultipleDatabaseApplication {

	@Autowired
	private BookRepo bookRepo;
	@Autowired
	private UserRepo userRepo;
	
	private void adddata2DB() {
		userRepo.saveAll(Stream.of(new User(744,"john"),new User(567,"joey")).collect(Collectors.toList()));
		bookRepo.saveAll(Stream.of(new Book(111,"java"),new Book(112,"javascript")).collect(Collectors.toList()));
	}
	@GetMapping("/getUsers")
	public List<User> getUsers(){
		return userRepo.findAll();
	}
	@GetMapping("/getBooks")
	public List<Book> getBooks(){
		return bookRepo.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(MultipleDatabaseApplication.class, args);
	}

}
