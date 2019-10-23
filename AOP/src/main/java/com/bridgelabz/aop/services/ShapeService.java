package com.bridgelabz.aop.services;

import com.bridgelabz.aop.model.Circle;
import com.bridgelabz.aop.model.Triangel;

public class ShapeService {
	private Circle circle;
	private Triangel triangel;

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangel getTriangel() {
		return triangel;
	}

	public void setTriangel(Triangel triangel) {
		this.triangel = triangel;
	}

}