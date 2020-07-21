package com.emmanuel.plumas.p7JavaLibrarEasyApi.service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.BookEntity;
import com.emmanuel.plumas.p7JavaLibrarEasyApi.repository.IBookRepository;

@Service
@Qualifier("BookService")
public class BookService {

	@Autowired
	@Qualifier("IBookRepository")
	private IBookRepository bookRepository;

	@Autowired
	@Qualifier("CopyService")
	private CopyService copyService;
	
	@Autowired
	@Qualifier("BorrowService")
	private BorrowService borrowService;
	
	public Optional<BookEntity> getBookById(Long bookId) {
		Optional<BookEntity> bookEntity=bookRepository.findById(bookId);
		return bookEntity;
	}
	
	public List<BookEntity> getAllBooks(){
		List<BookEntity> bookEntities=(List<BookEntity>) bookRepository.findAll();
		return bookEntities;
	}

	public HashMap<Integer, BookEntity> getsBookByTitleAvalaibale(String bookTitle) {
		/* Recherche de la liste des bookEntity pour un bookTitle */
		List<BookEntity> bookEntities =bookRepository.findByBookTitle(bookTitle);
		
		Map<Integer, BookEntity> booksAvailable = new HashMap<>();
 		
		for(BookEntity bookEntity: bookEntities) {
			booksAvailable.put(copyService.getCopyNumberAvailableByBookEntity(bookEntity), bookEntity);
		}
		
		return (HashMap<Integer, BookEntity>) booksAvailable;
	}
	
}
