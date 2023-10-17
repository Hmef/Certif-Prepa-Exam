package com.OCP81Z0809.QuestionTime.Chap2.Ex4;

public class Color {

	int red, green, blue;
	
	Color() {
		
		//Color(10, 10, 10);  ==> Compiler Error : cannot find Symbol
		this(10, 10, 10); //  ==> Solution : Call the other Constructor (Constructor with parameters) inside this Constructor ==> using this Keyword
		
	}
	
	Color(int r, int g, int b) {
		red = r;
		green = g;
		blue = b;
	}
	
	void printColor() {
		System.out.println(" red: " + red + " green : " + green + " blue : " + blue);
	}
	
	public static void main(String[] args) {
		
		Color color = new Color();
		color.printColor();
		
	}
}
