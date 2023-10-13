package com.OCP81Z0809.QuestionTime.Chap2;

public class Color {

	int red, green, blue;
	
	void Color() {
		
		red = 10;
		green = 10;
		blue = 10;
		System.out.println("void Color() method, is not a Constructor !! ");
		System.out.println(" red ==> " + red + " green ==> " + green + " blue ==> " + blue);
		
	}
	
	void printColor() {
		System.out.println(" red: " + red + " green: " + green + " blue: " + blue);
	}
	
	public static void main(String[] args) {
		
		Color color = new Color();
		color.printColor();
		color.Color();
	}
	
}
