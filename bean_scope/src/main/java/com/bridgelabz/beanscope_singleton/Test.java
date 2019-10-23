package com.bridgelabz.beanscope_singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("singletoneBeans.xml");
		Employee e1 = context.getBean("employee", Employee.class);
		e1.setId(03);
		e1.setName("Ravi");
		System.out.println(e1);
	}

}
