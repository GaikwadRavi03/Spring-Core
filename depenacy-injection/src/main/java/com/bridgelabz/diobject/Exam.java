package com.bridgelabz.diobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beanobj.xml");
		System.out.println("beanobj.xml loaded");
		Student s1 = context.getBean("student", Student.class);
		s1.cheating();

		AnotherStudent s2 = context.getBean("anotherstudent", AnotherStudent.class);
		s2.cheating();
	}
}