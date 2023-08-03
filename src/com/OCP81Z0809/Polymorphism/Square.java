package com.OCP81Z0809.Polymorphism;

public class Square extends Shape{

	private int side;
	
	public Square(int s) {
		
		side = s;
	}
	
	public double area() {
		
		return side * side;
	}
	
}
