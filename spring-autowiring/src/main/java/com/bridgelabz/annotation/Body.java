package com.bridgelabz.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotation.xml");
		HumanAnno human = context.getBean("humanano", HumanAnno.class);
		human.startPumping();
	}
}
