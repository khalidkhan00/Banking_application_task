package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Transaction;
import com.entity.User;
import com.repository.TransactDAO;
import com.repository.UserDAO;

@Service
public class TransactionService {
	
	List<User> acclist = new ArrayList<User>();
	List<Transaction> transactList = new ArrayList<Transaction>();
	
	@Autowired
	private TransactDAO transactdao;
	private UserDAO userdao;
	
	public void extractalltranfers() {
		transactList = transactdao.findAll();
	}
	public void extractallusers() {
		acclist = userdao.findAll();
	}
	
	public String transfer(Transaction transaction) {
		extractallusers();
		for(User user:acclist) {
			if((transaction.getFromAcc().equals(user.getAccNo()))&&(transaction.getAmount()<= user.getAmount())) {
				return "Transaction successfull";
			}
		}
		return "Transaction unsuccessfull";
		
	}

	public List<Transaction> allTransfers(String AccNo)
	{
		extractalltranfers();
		List<Transaction> specTransfer = new ArrayList<Transaction>();
		for(Transaction transact:transactList) {
			if(AccNo==(transact.getFromAcc())) {
				specTransfer.add(transact);
				
			}
		}
		return specTransfer;
		
	}
}
