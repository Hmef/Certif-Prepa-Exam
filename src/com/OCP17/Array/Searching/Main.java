package com.OCP17.Array.Searching;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		// Sorted Array
		int[] numbers = {2,4,6,8};
		
		System.out.println(Arrays.binarySearch(numbers, 4));
		System.out.println(Arrays.binarySearch(numbers, 3));
		System.out.println(Arrays.binarySearch(numbers, 1));
		System.out.println(Arrays.binarySearch(numbers, 2));
		System.out.println(Arrays.binarySearch(numbers, 9)); // 9 should be inserted at index 4, we negate 4 and substruct 1 ==> -4 -1 ==> -5
		
		/*
		 * Exam TIP : Only if the Array is already sorted 
		 */
		
		
		// Unsorted Array
		int[] nums = {3,2,1};
		
		System.out.println(" Unsorted Array ");
		System.out.println(Arrays.binarySearch(nums, 3));
	}
}
