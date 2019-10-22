package com.bridgelabz.autowiring;

public class Human {

	private Heart heart;

	public Human() {
	}

	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("human constructer call as heart as argument");
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("Dead");
		}
	}
}
