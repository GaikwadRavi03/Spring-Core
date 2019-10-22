package com.bridgelabz.loadingfrompropertiesfile_anno;

import org.springframework.beans.factory.annotation.Value;

public class Student_Anno {

	private String name;
	private String intrestedCourse;
	private String hobby;

	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}

//	@Required
	@Value("${student.intrestedCourse}")
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}

//	@Required
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void displayStudentInfo() {
		System.out.println("Student Name :" + name);
		System.out.println("Student Intrested Course :" + intrestedCourse);
		System.out.println("Student Hobby :" + hobby);
	}
}