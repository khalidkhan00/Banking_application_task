package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.AppOwnerDAO;

@Service
public class AppOwnerService {
	
	@Autowired
	private AppOwnerDAO appownerdao;
	
	

}
