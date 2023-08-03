package com.OCP81Z0809.Polymorphism;

public class Circle extends Shape{

	public int radius;
	
	public Circle(int r) {
		
		radius = r;
	}
	
	public double area() {
		
		return Math.PI * radius * radius;
	}
}
