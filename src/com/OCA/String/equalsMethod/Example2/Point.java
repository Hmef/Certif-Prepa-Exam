package com.OCA.String.equalsMethod.Example2;

public class Point {

	private double x, y;
	
	public Point(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	
	// Surcharger equals() pour comparer deux objets
	@Override
	public boolean equals(Object o) {  // equals() method 
		
		if(o == this) {
			
			return true;
		}
		
		if(!(o instanceof Point)) {  // instanceof
			
			return false;
		}
		
		Point p = (Point) o; 
		return Double.compare(x, p.x) == 0    // compare() method 
				&& Double.compare(y, p.y) == 0;
	}
	
}
