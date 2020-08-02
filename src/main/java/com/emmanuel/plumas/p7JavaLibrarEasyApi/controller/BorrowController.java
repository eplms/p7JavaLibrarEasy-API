package com.emmanuel.plumas.p7JavaLibrarEasyApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.BorrowEntity;
import com.emmanuel.plumas.p7JavaLibrarEasyApi.service.BorrowService;

@RestController
public class BorrowController {

	@Autowired
	@Qualifier("BorrowService")
	private BorrowService borrowService;
	
	@GetMapping(value="borrow/{userLastName}")
	public List<BorrowEntity> getBorrowByUserName(@PathVariable String userLastName){
		List<BorrowEntity> borrowEntities=borrowService.getBorrowByUserLastName(userLastName);
		return borrowEntities;
	}
	
}
