package com.bridgelabz.loadingfrompropertiesfile_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client_Anno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans-student-anno.xml");
		Student_Anno s1 = context.getBean("studentObjValue", Student_Anno.class);
		System.out.println(s1);
		s1.displayStudentInfo();
	}

}