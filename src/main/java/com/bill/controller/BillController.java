package com.bill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bill.model.Bill;
import com.bill.service.BillService;

@RestController
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	BillService billserv;
	
	@GetMapping
	public ResponseEntity<List<Bill>> getAllBills(){
		return new ResponseEntity<>(billserv.getAllBills(),HttpStatus.OK);
	}
	
	@PostMapping
	public void addBill(@RequestBody Bill bill) {
		billserv.addBill(bill);
	}
	
	

}
