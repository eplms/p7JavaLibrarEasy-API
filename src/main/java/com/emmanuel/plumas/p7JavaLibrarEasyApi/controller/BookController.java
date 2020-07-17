package com.emmanuel.plumas.p7JavaLibrarEasyApi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.BookEntity;
import com.emmanuel.plumas.p7JavaLibrarEasyApi.service.BookService;

@RestController
public class BookController {

	@Autowired
	@Qualifier("BookService")
	private BookService bookService;
	
	/*
	@GetMapping(value="book/{bookId}")
	public Optional<BookEntity> getBooksById(@PathVariable Long bookId) {
		Optional<BookEntity> bookEntity= bookService.getBookById(bookId) ;
		return bookEntity;
	}
	*/
	@GetMapping(value="book/{bookTitle}")
	public Map<BookEntity,Integer> getBooksByTitle(@PathVariable String bookTitle){
		HashMap<BookEntity, Integer> booksAvailable=bookService.getsBookByTitleAvalaibale(bookTitle);
		return booksAvailable;
	}
	
	
	@GetMapping(value="books")
	public List<BookEntity> getAllBooks(){
		List<BookEntity> bookEntities=bookService.getAllBooks();
		return bookEntities;
	}
	
	
}
