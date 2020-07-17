package com.emmanuel.plumas.p7JavaLibrarEasyApi.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.BorrowEntity;
import com.emmanuel.plumas.p7JavaLibrarEasyApi.model.CopyEntity;

@Repository
@Qualifier("IBorrowRepository")
public interface IBorrowRepository extends CrudRepository<BorrowEntity, Long>{

	List<BorrowEntity> getBorrowByCopyEntity(CopyEntity copyEntity);

}
