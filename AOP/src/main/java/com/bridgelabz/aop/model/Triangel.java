package com.bridgelabz.aop.model;

public class Triangel {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("triangle setter called");
	}

}