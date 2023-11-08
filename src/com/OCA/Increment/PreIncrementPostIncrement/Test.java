package com.OCA.Increment.PreIncrementPostIncrement;

public class Test {

	public static void main(String[] args) {
		
		int[] arr = {2, 5, 6, 9, 4};
		
		for(int i=0; i<arr.length; ++i) {  
			
			System.out.print(arr[i] + " ");  // i == 0 not i == 1
			System.out.println(" i == " + i);
		}
		
		System.out.println(" ");
		
		int a = 1;
		System.out.println(" a++ : " + a++);
		
		int b = 1;
		System.out.println(" ++b : " + ++b); 
		
		int c = 10++; // we can't increment a constant value 
		
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
