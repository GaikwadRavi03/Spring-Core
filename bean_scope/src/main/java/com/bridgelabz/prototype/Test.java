package com.bridgelabz.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("singletoneBeans.xml");
		Employee1 e1 = context.getBean("emp", Employee1.class);
		e1.setId(03);
		e1.setName("Ravi");
		System.out.println(e1);

		Employee1 e2 = context.getBean("emp", Employee1.class);
		e2.setId(21);
		e2.setName("Rohit");
		System.out.println(e2);

		((AbstractApplicationContext) context).close();
	}

}
