package com.emmanuel.plumas.p7JavaLibrarEasyApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.UserEntity;
import com.emmanuel.plumas.p7JavaLibrarEasyApi.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	@Qualifier("UserService")
	private UserService userService;

	@GetMapping(value="libraryUser/{userLastName}")
	public UserEntity getUserByLastName (@PathVariable String userLastName) {
		UserEntity userEntity=userService.getUserByUserLastName(userLastName);
		return userEntity;
	}
	
}
