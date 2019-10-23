package com.bridgelabz.autowiring_byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansByName.xml");
		Employee e1 = context.getBean("emp", Employee.class);
		System.out.println(e1);
		((AbstractApplicationContext) context).close();

	}

}
