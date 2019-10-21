package com.bridgelabz.diconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beansconstructor.xml");
		StudentCon s1 = context.getBean("Student1", StudentCon.class);
		s1.displayStudentInfo();

		StudentCon s2 = context.getBean("Student2", StudentCon.class);
		s2.displayStudentInfo();
	}

}