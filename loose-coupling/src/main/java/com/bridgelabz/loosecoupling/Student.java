package com.bridgelabz.loosecoupling;

public class Student {

	private Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;

	}

	public void cheating() {
		cheat.cheat();
	}
}