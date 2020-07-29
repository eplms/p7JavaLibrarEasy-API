package com.emmanuel.plumas.p7JavaLibrarEasyApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.UserEntity;
import com.emmanuel.plumas.p7JavaLibrarEasyApi.repository.IUserRepository;

@Service
@Qualifier("UserService")
public class UserService {
	
	@Autowired
	@Qualifier("IUserRepository")
	private IUserRepository userRepository;
	
	public UserEntity getUserByUserLastName(String userLastName) {
		UserEntity userEntity=userRepository.getByUserLastName(userLastName);
		return userEntity;
	}
}
