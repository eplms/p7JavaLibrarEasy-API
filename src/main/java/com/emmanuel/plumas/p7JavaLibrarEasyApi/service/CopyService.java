package com.emmanuel.plumas.p7JavaLibrarEasyApi.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.BookEntity;
import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.BorrowEntity;
import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.CopyEntity;
import com.emmanuel.plumas.p7JavaLibrarEasyApi.repository.ICopyRepository;

@Service
@Qualifier("CopyService")
public class CopyService {

	@Autowired
	@Qualifier("ICopyRepository")
	private ICopyRepository copyRepository;
	
	@Autowired
	@Qualifier("BorrowService")
	private BorrowService borrowService;
	
	public int getCopyNumberAvailableByBookEntity(BookEntity bookEntity){
		List<CopyEntity> copyList= copyRepository.findByBookEntity(bookEntity);
		int availableCopyNumber=copyList.size();
		for(CopyEntity copyEntity : copyList) {
			/* Récupération de tous les prêts pour une copyEntity */
			List<BorrowEntity> borrowList=borrowService.getBorrowByCopyEntity(copyEntity);
			/* Récupération de la date du jour*/
			Date date= new Date();
			for (BorrowEntity borrowEntity:borrowList) {
			    if( (borrowEntity.getStartDate().compareTo(date)<0) && (date.compareTo(borrowEntity.getEndDate())<0) ) {
			    	availableCopyNumber=availableCopyNumber-1;
				}
			}   
		}
		return availableCopyNumber;
	}
	
}
