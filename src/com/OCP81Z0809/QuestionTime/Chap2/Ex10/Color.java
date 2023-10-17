package com.OCP81Z0809.QuestionTime.Chap2.Ex10;

public class Color {
	
	int red, green, blue;
	
	 Color() {
		
		this(10, 10, 10);
	}
	
	 Color(int r, int g, int b) {
		
		red = r;
		green = g;
		blue = b;
	}
	
	 String toString() {
		
		return "The color is : " + " red = " + red + " green = " + green + " blue = " + blue;
	}

	public static void main(String[] args) {
		
		// implicitly invoce toString() method
		System.out.println(new Color());
	}
}
