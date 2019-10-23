package com.bridgelabz.autowiring_bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansByType.xml");
		Employee1 e1 = context.getBean("emp", Employee1.class);
		System.out.println(e1);
		((AbstractApplicationContext) context).close();

	}

}
