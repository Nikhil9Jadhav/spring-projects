package com.learning.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.model.Todo;

@Service
public class TodoService {

	private static List<Todo> todoList = new ArrayList<Todo>();
	private static int todoCount = 3;
	
	static {
		todoList.add(new Todo(1,"Nikhil","Learn Spring MVC" ,new Date() ,false));
		todoList.add(new Todo(2,"Nikhil","Practice Db problems" ,new Date() ,false));
		todoList.add(new Todo(3,"Nikhil","Arrays Queue" ,new Date() ,false));
	}
	
	//Add a todo object
	public void addTodo(String user , String desc , Date date , boolean isDone) {
		todoList.add(new Todo(++todoCount,user,desc,date,isDone));
	}
	
	//Delete a todo object
	public void delete(int id) {
		Iterator<Todo> iterator = todoList.iterator();
		
		while(iterator.hasNext()) {
			Todo todoToDelete = iterator.next();
			if(todoToDelete.getId() == id) {
				iterator.remove();
			}
		}
	}
	
	//Retrieve the todo.
	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for (Todo todo : todoList) {
			if (todo.getUser().equals(user))
				filteredTodos.add(todo);
		}
		return filteredTodos;
	}

}
