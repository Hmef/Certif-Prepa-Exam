package com.OCP17.Array.Sorting;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {3, 2, 7, 4};
		
		Arrays.sort(numbers);
		
		for(int i=0; i<numbers.length; i++)
			System.out.println(numbers[i]);
		
		// Or 
		System.out.println(" Arrays.toString() ");
		System.out.println(Arrays.toString(numbers));
	}
}
