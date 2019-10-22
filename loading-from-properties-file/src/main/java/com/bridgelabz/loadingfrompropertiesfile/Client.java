package com.bridgelabz.loadingfrompropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans-student.xml");
		Student s1 = context.getBean("student", Student.class);
		s1.displayStudentInfo();
	}

}
