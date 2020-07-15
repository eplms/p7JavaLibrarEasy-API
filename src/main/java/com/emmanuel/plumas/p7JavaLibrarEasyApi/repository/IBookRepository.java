package com.emmanuel.plumas.p7JavaLibrarEasyApi.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.BookEntity;

@Repository
@Qualifier("IBookRepository")
public interface IBookRepository extends CrudRepository<BookEntity,Long>{

	Optional<BookEntity> findByBookTitle(String bookTitle);

	
}
