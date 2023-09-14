package com.OCP17.Array.Sorting;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {3, 2, 7, 4};
		
		Arrays.sort(numbers);
		
		for(int i=0; i<numbers.length; i++)
			System.out.print(numbers[i] + " ");
		
		System.out.println("");
		// Or 
		System.out.println(" Arrays.toString() ");
		System.out.println(Arrays.toString(numbers));
		
		// String
		String[] strings = { "10" , "9" , "100" };
		Arrays.sort(strings);
		
		for(String s : strings)
			System.out.print(s + " ");
		
		/*
		 * Exam TIP : Arrays of String ==> create custom sort orders using a comparator
		 */
	}
}
