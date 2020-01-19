package com.exercise12oopshape.model;

public abstract class Shape implements Shapeable, Somethingable {

	@Override
	public String draw() {
		return "";
	}

	@Override
	public String changeColor() {
		return "";
	}

	@Override
	public String Erase() {
		return "";
	}

	@Override
	public double CalculateArea() {
		return 0;
	}

	@Override
	public double CalculatePerimeter() {
		return 0;
	}
	
}
