package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learning.service.LoginService;


@Controller
@SessionAttributes("name")
public class LoginController {
	
	//Set the login service here - Auto Wiring
	@Autowired
	LoginService validate;
	
	@RequestMapping(value = "/login" ,method = RequestMethod.GET)
	public String showLoginPage() {
		return "loginForm";
	}
	
	@RequestMapping(value = "/login" ,method = RequestMethod.POST)
	public String handleLoginForm(@RequestParam String name ,@RequestParam String password, ModelMap model) {
		
		if(!validate.isValidCredentials(name, password)){
			model.put("errorMessage", "Invalid User");
			return "loginForm";
		}
		
		model.put("name", name);
		model.put("password", password);
		return "welcomePage";
	}

}
