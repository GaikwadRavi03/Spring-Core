package com.bridgelabz.my_di_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("myDI_SetterBeans.xml");
		EmployeeS e1 = context.getBean("emp1", EmployeeS.class);
		System.out.println(e1);
		((AbstractApplicationContext) context).close();

	}

}