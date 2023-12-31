package com.OCA.Increment.PreIncrementPostIncrement;

public class Test {

	public static void main(String[] args) {
		
		int[] arr = {2, 5, 6, 9, 4};
		
		// Pre-Increment in a loop 
		for(int i=0; i<arr.length; ++i) {  
			
			System.out.print(arr[i] + " ");  // i == 0 not i == 1
			System.out.println(" i == " + i);
		}
		
		System.out.println(" ");
		
		int a = 1;
		System.out.println(" a++ : " + a++);
		
		int b = 1;
		System.out.println(" ++b : " + ++b); 
		
		//int c = 10++; // ==> Error - we can't increment a constant value 
		
		int x = 4;
		int y = x++ + 100;  // y == 104   x == 5 ( we make the operation with the actual value of x and then x is Incremented )
		System.out.println(" x : " + x);
		System.out.println("y : " + y);
		
		/*
		 * 							Exam TIP 
		 * 
		 * 		++b ==> pre-increment: Increment the b variable BEFORE it's value is returned  
		 * 							  
		 * 		a++ ==> post-Increment : return the value of a and the increment the a variable 
		 * 
		 */
		
		
	}
}
