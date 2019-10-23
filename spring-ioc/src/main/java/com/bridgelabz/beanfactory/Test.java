package com.bridgelabz.beanfactory;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		org.springframework.core.io.Resource resource = (org.springframework.core.io.Resource) new ClassPathResource(
				"BeanFactoryBeans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Employee e1 = beanFactory.getBean("emp", Employee.class);
		System.out.println(e1);
	}

}
