package com.emmanuel.plumas.p7JavaLibrarEasy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.emmanuel.plumas.p7JavaLibrarEasy.model.BookEntity;
import com.emmanuel.plumas.p7JavaLibrarEasy.repository.IBookRepository;

@Service
@Qualifier("BookService")
public class BookService {

	@Autowired
	@Qualifier("IBookRepository")
	private IBookRepository bookRepository;
	
	public Optional<BookEntity> getBookById(Long bookId) {
		Optional<BookEntity> bookEntity=bookRepository.findById(bookId);
		return bookEntity;
	}
	
	public List<BookEntity> getAllBooks(){
		List<BookEntity> bookEntities=(List<BookEntity>) bookRepository.findAll();
		return bookEntities;
	}
	
}
