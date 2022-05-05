package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.entity.UserRegister;
import com.repository.UserDAO;
import com.repository.UserRegisterDAO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userdao;
	@Autowired
	private UserRegisterDAO userregisterdao;
	
	public String loginValid() {
		return null;
	}
	
	public String addUsers(UserRegister userregister) {
		
		userregisterdao.save(userregister);
		return "user added";
		/*
		 * if(userregisterdao.exists(userregister.getEmail())) { return
		 * "already exists"; } else { userregisterdao.save(userregister); return
		 * "user added"; }
		 */
	}
	
	public String addDetails(User user) {
		userdao.save(user);
		return "user details added";
	}
	

}
