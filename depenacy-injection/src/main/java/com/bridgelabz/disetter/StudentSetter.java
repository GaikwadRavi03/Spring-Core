package com.bridgelabz.disetter;

public class StudentSetter {
	private int studentId;
	private String studentName;

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void displayStudentInfo() {
		System.out.println("Student id :" + studentId);
		System.out.println("Student Name :" + studentName);
	}
}
