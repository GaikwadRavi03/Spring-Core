package com.bridgelabz.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-autowire.xml");
		Human human = context.getBean("human", Human.class);
		human.startPumping();
	}

}
