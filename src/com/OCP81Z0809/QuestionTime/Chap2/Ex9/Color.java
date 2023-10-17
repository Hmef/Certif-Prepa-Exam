package com.OCP81Z0809.QuestionTime.Chap2.Ex9;

public class Color {

	int red, green, blue;
	
	public Color() {
		
		this(10, 10, 10);
	}
	
	public Color(int r, int g, int b) {
		
		red = r;
		green = g;
		blue = b;
	}
	
	public String toString() {
		
		return " The color is: " + red + green + blue ;  // The color is: 101010
	}
	
	public void printColor() {
		
		System.out.println(" red: " + red + " green : " + green + " blue : " + blue);
		System.out.println( red+ green + blue );     // ==> 30
	}
	
	
	public static void main(String[] args){
		
		System.out.println(new Color());
		
		Color color = new Color();
		color.printColor();
	}
	
	
	/*
	 *   toString() : Since the first entry is String, the + becomes the String Concatenation Operator ==> prints "  The color is: 101010 "
	 */
	
}
