package com.OCP81Z0809.QuestionTime.Chap2.Ex7;

/*
 *   Access-Modifier ==> default - public - protected - private  
 */
public class Circle extends Shape {

	public void display() {
		 
		System.out.println("Display-Derived");	
	}
	
	
	public static void main(String[] args) {
		
		Shape circle = new Circle();
		circle.display();
		
		Shape shape = new Shape();
		shape.display();
	
	}
	
	/*
	 *  Base Class ==> protected      		Derived Class ==> protected and public BOTH can be used 
	 *  
	 *  We can provide only a less restrictive or same access-modifier when overriding the method 
	 */
}
