package com.bridgelabz.lifecycle_using_xmlconfig;

public class Employee {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public void init() {
		System.out.println("init method called");
	}

	public void destroy() {
		System.out.println("destroy method called");
	}
}
