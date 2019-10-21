package com.bridgelabz.springioc;

public class Airtel implements Sim {

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling using airtel sim");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("brousing internet using airtel sim");
	}

}
