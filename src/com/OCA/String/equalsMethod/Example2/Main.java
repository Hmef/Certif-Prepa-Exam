package com.OCA.String.equalsMethod.Example2;

public class Main {

	public static void main(String[] args) {
		
		Point p1 = new Point(5,10);
		Point p2 = new Point(5,10);
		
		if(p1 == p2) {
			 System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}
	}
	
	// String Object created by new is never Pooled 
}
