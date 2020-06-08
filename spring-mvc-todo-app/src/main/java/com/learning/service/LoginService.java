package com.learning.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean isValidCredentials(String userName , String password) {
		
		if(userName.equalsIgnoreCase("nikhil") && password.equals("12345")) {
			return true;
		}
		
		return false;
		
	}
	
}
