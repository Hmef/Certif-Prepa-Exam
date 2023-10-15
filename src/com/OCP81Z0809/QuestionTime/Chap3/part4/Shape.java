package com.OCP81Z0809.QuestionTime.Chap3.part4;

public class Shape {

	private boolean isDisplayed;
	protected int canvasID;
	
	public Shape() {
		isDisplayed = false;
		canvasID = 0;
	}
	
	public class Color {
		
		public void display() {
			
			System.out.println(" isDisplayed : "+ isDisplayed);
			System.out.println(" canvasID : " + canvasID);
		}
	}
}
