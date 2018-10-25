package com.bill.service;

import java.util.List;

import com.bill.model.Bill;



public interface BillService {
	
	List<Bill> getAllBills();
	void addBill(Bill bill);

}
