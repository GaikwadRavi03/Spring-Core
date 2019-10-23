package com.bridgelabz.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("singletoneBeans.xml");
		Employee e1 = context.getBean("employee", Employee.class);
		e1.setId(03);
		e1.setName("Ravi");
		System.out.println(e1);

		Employee e2 = context.getBean("employee", Employee.class);
		e2.setId(21);
		e2.setName("Rohit");
		System.out.println(e2);

		((AbstractApplicationContext) context).close();
	}

}
