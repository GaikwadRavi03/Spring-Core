package com.bridgelabz.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean-loose-coup.xml");
		Student s1 = context.getBean("student", Student.class);
		s1.cheating();
	}
}