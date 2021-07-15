package com.example.systemlibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.systemlibrary.model.Books;
import com.example.systemlibrary.service.BookService;

@Controller
public class BooksController {
	
	@Autowired
	BookService booksService;
	
	
	@RequestMapping("/display") public String DisplayThis() { return "You got me"; }
	 
	
	@GetMapping("/book")
	private List<Books>  getAllBooks() {
		return booksService.getAllBooks();
	}
	
	@GetMapping("/book/{bookdid}")
	private Books getBooks(@PathVariable("bookid") int bookid) {
		return booksService.getBooksById(bookid);
	}
	
	@DeleteMapping("/book/{bookid}")
	private void deleteBook(@PathVariable("bookid") int bookid){
		booksService.delete(bookid);
	}
	@PostMapping("/books")
	private int saveBooks(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
		return books.getBookID();
	}
	
	@PutMapping("/books") 
	private Books update(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
		return books;
	}
	

}
