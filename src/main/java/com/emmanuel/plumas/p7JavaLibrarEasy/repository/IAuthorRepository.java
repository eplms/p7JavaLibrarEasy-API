package com.emmanuel.plumas.p7JavaLibrarEasy.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emmanuel.plumas.p7JavaLibrarEasy.model.AuthorEntity;

@Repository
@Qualifier("IAuthorRepository")
public interface IAuthorRepository extends CrudRepository<AuthorEntity, Long>{

}
