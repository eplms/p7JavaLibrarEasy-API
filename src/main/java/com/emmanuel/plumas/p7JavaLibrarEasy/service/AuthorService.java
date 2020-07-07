package com.emmanuel.plumas.p7JavaLibrarEasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.emmanuel.plumas.p7JavaLibrarEasy.model.AuthorEntity;
import com.emmanuel.plumas.p7JavaLibrarEasy.repository.IAuthorRepository;

@Service
@Qualifier("AuthorService")
public class AuthorService {

	@Autowired
	@Qualifier("IAuthorRepository")
	private IAuthorRepository authorRepository;
	
	public List<AuthorEntity> getAllBooks(){
		List <AuthorEntity> authorEntities=(List<AuthorEntity>) authorRepository.findAll();
		return authorEntities;
	}
}
