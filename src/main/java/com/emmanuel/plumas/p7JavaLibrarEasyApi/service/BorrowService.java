package com.emmanuel.plumas.p7JavaLibrarEasyApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.BorrowEntity;
import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.CopyEntity;
import com.emmanuel.plumas.p7JavaLibrarEasyApi.repository.IBorrowRepository;

@Service
@Qualifier("BorrowService")
public class BorrowService {

	@Autowired
	@Qualifier("IBorrowRepository")
	private IBorrowRepository borrowRepository;
	
	
	public List<BorrowEntity> getBorrowByCopyEntity(CopyEntity copyEntity) {
		List<BorrowEntity> borrowEntities=borrowRepository.getBorrowByCopyEntity(copyEntity);
		return borrowEntities;
	}
}
