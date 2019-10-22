package com.bridgelabz.loadingfrompropertiesfile;

public class Student {

	private String name;
	private String intrestedCourse;
	private String hobby;

	public void setName(String name) {
		this.name = name;
	}

	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void displayStudentInfo() {
		System.out.println("Student Name :" + name);
		System.out.println("Student Intrested Course :" + intrestedCourse);
		System.out.println("Student Hobby :" + hobby);
	}
}
