package com.bridgelabz.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HumanAnno {

	private Heart heart;

	public HumanAnno() {
	}

	public HumanAnno(Heart heart) {
		this.heart = heart;
		System.out.println("human constructer call as heart as argument");
	}

	@Autowired
	@Qualifier("octopuseheart")
	public void setHeart(Heart heart) {
		System.out.println("Setter method called");
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("name of animal is" + " " + heart.getNameOfAnimal() + "no of heart is" + " "
					+ heart.getNoOfHeart());
		} else {
			System.out.println("Dead");
		}
	}
}
