package com.nissan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nissan.model.Bank;

public interface ICustomerRepository extends CrudRepository<Bank, Integer> {
	
@Query("update com.nissan.model.Bank set balance=(balance+?2) where accountNumber=?1")
	public List<Bank> findBalance(int accountNumber,int amount);
	


}
