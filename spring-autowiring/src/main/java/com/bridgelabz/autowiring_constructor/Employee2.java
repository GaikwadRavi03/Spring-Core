package com.bridgelabz.autowiring_constructor;

public class Employee2 {
	private int id;
	private String name;
	private Address2 address;

	public Employee2(int id, String name, Address2 address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", address1=" + address + "]";
	}

}
