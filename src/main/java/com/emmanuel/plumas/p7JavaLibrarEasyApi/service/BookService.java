package com.emmanuel.plumas.p7JavaLibrarEasyApi.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.BookEntity;
import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.BookEntityAvailable;
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

	public List<BookEntityAvailable> getsBookByTitleAvalaibale(String bookTitle) {
		/* Recherche de la liste des bookEntity pour un bookTitle */
		List<BookEntity> bookEntities =bookRepository.findByBookTitle(bookTitle);
		List<BookEntityAvailable> bookEntitiesAvailable= transformBookEntityToAvailable(bookEntities);
		return bookEntitiesAvailable;
	}
	
	
	private List<BookEntityAvailable> transformBookEntityToAvailable(List<BookEntity> bookEntities){
		List<BookEntityAvailable> bookEntitiesAvailable= new ArrayList<BookEntityAvailable>();
		for(int i=0; i< (bookEntities.size());i++) {
			BookEntityAvailable bookEntityAvailable=new BookEntityAvailable();
			BookEntity bookEntity= bookEntities.get(i);
			bookEntityAvailable.setBookId(bookEntity.getBookId()); 
			bookEntityAvailable.setBookTitle(bookEntity.getBookTitle());
			bookEntityAvailable.setEditor(bookEntity.getEditor());
			bookEntityAvailable.setBookType(bookEntity.getBookType());
			bookEntityAvailable.setAuthorEntity(bookEntity.getAuthorEntity());
			bookEntityAvailable.setAvailableCopyNumber(copyService.getCopyNumberAvailableByBookEntity(bookEntity));
			bookEntitiesAvailable.add(bookEntityAvailable);
			}
		return bookEntitiesAvailable;
	}
	
}
