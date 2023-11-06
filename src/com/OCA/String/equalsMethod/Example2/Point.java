package com.OCA.String.equalsMethod.Example2;

public class Point {

	private double x, y;
	
	public Point(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	
	// Surcharger equals() pour comparer deux objets
	@Override
	public boolean equals(Object o) {
		
		if(o == this) {
			
			return true;
		}
		
		if(!(o instanceof Point)) {
			
			return false;
		}
		
		Point p = (Point) o;
		return Double.compare(x, p.x) == 0 
				&& Double.compare(y, p.y) == 0;
	}
	
}
