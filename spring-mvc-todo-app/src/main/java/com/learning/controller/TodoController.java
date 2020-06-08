package com.learning.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learning.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	TodoService service;
	
	@RequestMapping(value="/listtodos")
	public String listTodos(ModelMap model) {
		
		model.addAttribute("todos", service.retrieveTodos("Nikhil"));
		return "listTodo";
		
	}
	
	@RequestMapping(value="/show-addtodo")
	public String showTodoForm() {
		return "show-addtodo";
	}
	
	@RequestMapping(value="/addtodo")
	public String addTodoToList(ModelMap model , @RequestParam String desc) {
		model.clear();
		service.addTodo("Nikhil", desc, new Date(), false);
		return "redirect:listtodos";
	}
	
	@RequestMapping(value="/delete")
	public String deleteTodo(ModelMap model , @RequestParam String id) {
		model.clear();
		service.delete(Integer.parseInt(id));
		return "redirect:listtodos";
	}
	
}
