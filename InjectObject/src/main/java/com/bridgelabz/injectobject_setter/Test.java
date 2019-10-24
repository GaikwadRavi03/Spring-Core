package com.bridgelabz.injectobject_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansSetter.xml");
		Employee e1 = context.getBean("Emp", Employee.class);
		System.out.println(e1);
		((AbstractApplicationContext) context).close();

	}

}
