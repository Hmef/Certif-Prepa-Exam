package com.OCP.NestedIf;

public class NestedifDemo2 {

	public static void main(String[] args) {
		
		int i = 10;
		
		if(i == 10 && i < 15) {
			System.out.println("Outer if ");
			
			// Nested if 1-1
			if(i < 15)
				System.out.println(" i is smaller than 15 ");
			
			// Nested if 1-2
			if(i > 15) {
				
				System.out.println(" is is smaller than 12 ");
				
				// Nested if 2-1
				if(i < 13)
					System.out.println(" i is bigger than 20 ");
			}
			
		} else {
			System.out.println(" i is greater than 15 ");
		}
	}
}
