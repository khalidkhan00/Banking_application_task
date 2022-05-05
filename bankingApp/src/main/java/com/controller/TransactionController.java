package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Transaction;
import com.service.TransactionService;

@RestController
@RequestMapping("/mainapp/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionservice;
	
	@PostMapping("/transfer")
	public ResponseEntity<Object> transfer(@RequestBody Transaction transaction){
		if(transactionservice.transfer(transaction)=="Transaction Successfull") {
			return ResponseEntity.ok("Transaction Successfull");
		}
		else {
		return null;
		}
		
	}
	
	@GetMapping("/transfer/{AccNo}")
	public List<Transaction> allTransfer(@PathVariable("AccNo") String accNo){
		
		List<Transaction> transactlist = transactionservice.allTransaction(accNo);
		return transactlist;
		
	}

}
