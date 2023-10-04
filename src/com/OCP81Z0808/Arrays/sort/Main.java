package com.OCP81Z0808.Arrays.sort;

import java.util.Arrays;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		
		int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		// =========== ReverseOrder() ===========
		
		//Arrays.sort(arr, Collections.reverseOrder()); ==> ERROR 
		
		// Array of Integer 
		
		Integer[] arrInt = {13, 7, 6, 45, 21, 9, 2, 100 };
		
		Arrays.sort(arrInt);
		
		System.out.println(" ");
		
		System.out.println(Arrays.toString(arrInt));
		
		// =========== ReverseOrder() - Collections.reverseOrder()===========
		Arrays.sort(arrInt, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arrInt));
		
		
		
		/*
		 * Exam TIP : Collections.reverseOrder() applicable for Integer not int 
		 */
		
		
	}
}
