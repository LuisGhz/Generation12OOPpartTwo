package com.exercise12oopshape.model;

import java.lang.Math;

public  class Circle extends Shape {
	
	private double radio;
	
	public Circle () {}
	
	public Circle (double radio) {
		this.radio = radio;
	}
	
	public double CalculateArea(double radio) {		
		return (radio * radio) * Math.PI;
	}
	
	public double CalculatePerimeter(double radio) {		
		return 2 * Math.PI * radio;
	}
	
	//Getters and Setters
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}

}
