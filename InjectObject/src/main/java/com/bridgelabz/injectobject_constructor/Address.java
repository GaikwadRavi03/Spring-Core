package com.bridgelabz.injectobject_constructor;

public class Address {
	private String city;
	private String state;
	private String zip;

	public Address(String city, String state, String zip) {
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}

}
