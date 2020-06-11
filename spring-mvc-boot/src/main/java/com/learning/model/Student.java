package com.learning.model;

public class Student {
	
	private int studId;
	private String userName;
	private int age;
	
	public Student() {
		
	}
	
	public Student(int studId , int age , String userName) {
		this.studId = studId;
		this.age = age;
		this.userName = userName;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	
	@Override
	public String toString() {
		return String.format("Student [studId=%s, userName=%s, age=%s]", studId, userName, age);
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studId != other.studId)
			return false;
		return true;
	}
	
	
	
	
}
