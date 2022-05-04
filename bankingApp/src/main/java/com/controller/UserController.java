package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.entity.UserRegister;
import com.service.UserService;

@RestController
@RequestMapping("/mainapp")
public class UserController {
	@Autowired
	private UserService userservice;
	
	
	@PostMapping("/register")
	public ResponseEntity<Object> register(@RequestBody UserRegister userregister ){
		
		
		String res=userservice.addUsers(userregister);
		if(res=="user added") {
			return ResponseEntity.ok(res);
			}
		else  {
			return (ResponseEntity<Object>) ResponseEntity.badRequest();
		}
	}

}
