package com.emmanuel.plumas.p7JavaLibrarEasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emmanuel.plumas.p7JavaLibrarEasy.model.AuthorEntity;
import com.emmanuel.plumas.p7JavaLibrarEasy.service.AuthorService;

@RestController	
public class AuthorController {

	@Autowired
	@Qualifier("AuthorService")
	private AuthorService authorService;
	
	@GetMapping(value="authors")
	public List<AuthorEntity> getAllAuthors() {
		List<AuthorEntity> authorEntities=authorService.getAllBooks();
		return authorEntities;
	}
	
}
