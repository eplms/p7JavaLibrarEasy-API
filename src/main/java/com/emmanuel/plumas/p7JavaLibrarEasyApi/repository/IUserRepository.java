package com.emmanuel.plumas.p7JavaLibrarEasyApi.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.UserEntity;

@Repository
@Qualifier("IUserRepository")
public interface IUserRepository extends CrudRepository<UserEntity, Long>{

	UserEntity getByUserLastName(String userLastName);
	
}
