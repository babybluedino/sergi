package com.bill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.dao.BillDao;
import com.bill.model.Bill;


@Service
public class BillServiceImpl implements BillService {
	
	@Autowired
	public BillDao billDao;

	@Override
	public List<Bill> getAllBills() {
	   return billDao.findAll();
	}

	@Override
	public void addBill(Bill bill) {
		billDao.save(bill);
	}

}
