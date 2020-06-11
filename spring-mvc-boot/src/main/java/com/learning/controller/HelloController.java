package com.learning.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/")
	public String index() {
		return "welcomePage";
	}
	
	@RequestMapping(value = "/hello")
	public String hello(@RequestParam("name") String name,ModelMap model) {
		model.addAttribute("name",name);
		return "helloPage";
	}
}
