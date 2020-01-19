package com.exercise12oopshape.app;

import com.exercise12oopshape.model.*;
import java.util.Scanner;

public class Shape {
	public static void main(String... args) {
		
		double base = 0.0;
		double height = 0.0;
		double radio = 0.0;
		
		Square square1 = new Square();
		Triangle triangle1 = new Triangle();
		Circle circle1 = new Circle();
		
		Square square2 = new Square(10.2);
		Triangle triangle2 = new Triangle(5.0, 7.0);
		Circle circle2 = new Circle(5.6);
		
		Scanner kInput = new Scanner(System.in);
		
		System.out.println("Give me the radio of the circle");
		radio = kInput.nextDouble();
		
		System.out.println("The area of the circle is: " + circle1.CalculateArea(radio));
		
		kInput.close();
	}
}
