package com.learning.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.model.Student;
import com.learning.service.StudentService;

@RestController(value = "/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	//Get
	//Post
	//Put
	//Delete

	
	@PostMapping("add")
	public String addStudent(@RequestParam("userName") String userName , @RequestParam("age") String age,ModelMap model) {
		studentService.addNewStudent(age,userName);
		return "Student added successfully";
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents(){
		return studentService.getAllStudents();
	}
	
}
