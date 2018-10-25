package com.bill.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bill.model.Bill;

public interface BillDao extends JpaRepository<Bill, Integer> {
	
	

}
