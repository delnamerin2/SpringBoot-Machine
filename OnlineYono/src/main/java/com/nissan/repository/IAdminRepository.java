package com.nissan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.Bank;

@Repository
public interface IAdminRepository extends CrudRepository<Bank, Integer>{
	
	@Query("from Bank WHERE accountNumber like %?1%")
	public List<Bank> findByCustomerName(Integer accountNumber);
	
	@Query("update com.nissan.Bank set is_active=0 where accountNumber=?1")
	public void updateCustomer(Integer accountNumber);

	
	

}
