package com.bridgelabz.autowiring_constructor;

public class Address2 {
	private String city;
	private String state;
	private String zip;

	public Address2(String city, String state, String zip) {
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address1 [city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}

}
