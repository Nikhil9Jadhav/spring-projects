package com.learning.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.model.Student;

@Service
public class StudentService {

	private static List<Student> students = new ArrayList<Student>();
	private static int idCounter = 3;
	static {
		students.add(new Student(1, 20, "vhan"));
		students.add(new Student(2, 26, "nj"));
		students.add(new Student(3, 26, "smit"));
	}
	
//	Step 1 : Add a new entry of student.
// We will need age and username as input parameters and method should add a new entry in list and return an ack
	
   public boolean addNewStudent(String age, String userName) {
	  
	   if(null == userName) {
		   return false;
	   }
	   students.add(new Student(++idCounter , Integer.parseInt(age) , userName));
	   
	   return true;
   }
   
   
   //Now to get All Students
   public List<Student> getAllStudents(){
	
	   return students;
	   
   }

   
   //Now to get student by its id
   public Student getStudentById(int id) {
	   
	   for(Student student : students) {
		  if(student.getStudId() == id) {
			  return student;
		  }
	   }
	   
	   return null;
   }

   
   
}
