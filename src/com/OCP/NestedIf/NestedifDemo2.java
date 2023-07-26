package com.OCP.NestedIf;

public class NestedifDemo2 {

	public static void main(String[] args) {
		
		int i = 10;
		
		if(i == 10 || i < 15) {
			
			System.out.println(" Outer if ");
			
			// Nested if 1-1
			if(i < 15)
				System.out.println(" i is smaller than 15 ");
			
			// Nested if 1-2
			if(i > 15) {
				
				// Nested if 2-1
				if(i < 13)
					System.out.println(" i is smaller than 13 "); // Statement Not Printed 
				// else Nested if 2-1
				else 
					System.out.println(" else ");  // Statement Not Printed 
			} else 
				System.out.println(" else ==> if(i > 15) ");
			
			// Nested if 1-3
			if(i == 10) {
				
				System.out.println(" Nested if 1-3 ");
			} else 
				System.out.println(" Nested else 1-3 ");
			
		} else {
			System.out.println(" i is greater than 15 ");
		}
	}
}
