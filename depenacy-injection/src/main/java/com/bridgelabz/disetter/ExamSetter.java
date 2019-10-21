package com.bridgelabz.disetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beanssetter.xml");
		StudentSetter s1 = context.getBean("Student1", StudentSetter.class);
		s1.displayStudentInfo();

		StudentSetter s2 = context.getBean("Student2", StudentSetter.class);
		s2.displayStudentInfo();
	}

}
