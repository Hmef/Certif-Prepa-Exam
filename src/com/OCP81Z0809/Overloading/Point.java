package com.OCP81Z0809.Overloading;

public class Point {

	private int xPos, yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == null)
			return false;
		if(other instanceof Point) {
			Point anotherPoint = (Point) other;
			if((xPos == anotherPoint.xPos) && (yPos == anotherPoint.yPos))
				return true;
		}
			
		return false;
	}
	
	public static void main(String[] args) {
		
		Object p1 = new Point(10, 20);
		Object p2 = new Point(50, 100);
		Object p3 = new Point(10, 20);
		
		System.out.println("p1 equal p2 is " + p1.equals(p2));
		System.out.println("p1 equal p3 is " + p1.equals(p3));
		
	}
}
