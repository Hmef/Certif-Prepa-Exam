package com.OCA.PracticeTests.Chap4.Arrays.Ex3Ex4Ex6Ex7Ex9Ex24Ex25;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		/* 		Ex3     */
		int[] lowercase = new int[0];
		Integer[] uppercase = new Integer[0];

		/* 		Ex4     */
		
		//[]double lion;  // Error
		double[] tiger;
		double bear[];
		
		/* 		Ex6     */
		// buses.length()
		// buses.length
		// buses.size
		// buses.size()
		
		/* 		Ex7     */
		// int[][] blue = new int[2, 2];
		// int[][] blue = new int[2], [2];
		int[][] blue = new int[2][2];
		//int[][] blue = new int[2*2];
		
		/* 		Ex9     */
		/* what are the names of the methods to do searching and sorting on arrays */
		// Arrays.binarySearch() and Arrays.linearSort()
		// Arrays.binarySearch() and Arrays.sort()  
		// Arrays.search() and Arrays.linearSort()
		// Arrays.search() and Arrays.sort()
		
		// ==> Response: Arrays.binarySearch() and Arrays.sort() 
		
		/* 		Ex24     */
		boolean[][][] books, moreBooks;  // 3D arrays
		
		/* 		Ex25     */
		String[] strings = new String[2];
		System.out.println(strings);
		/*
		 * 	 	What is the possible Output of the following code??
		 * 
		 *    A. [null, null]
		 *    B. [,]
		 *    C. [Ljava.lang.String;@15db9742
		 *    D. None of the above
		 */
		
		// Solution ==> Arrays.toString()
		System.out.println(Arrays.toString(strings));
		
		String[] arr = new String[] {"aa","bb"};
		System.out.println(Arrays.toString(arr));
	}
	
	/*			Ex3 
	 * 
	 * 		Which of the following are primitive ? Trick Question
	 * 
	 * 		int is a primive type 
	 * 
	 * 		but int[] is an Array of int ==> All arrays are Objects
	 */
	
	/*
	 * 				Ex4
	 *   
	 *      the array braces are allowed to appear before and after variable NAME
	 *      
	 *      the braces are not allowed to appear before the type 
	 */
	
	/*
	 * 				Ex6
	 * 	
	 * 		if buses is an ArrayList ==> size() method determine the number of element 
	 * 		Arrays use the length variable for counting the number of elements	
	 */
	
	/*
	 * 				Ex24
	 * 
	 * 	   the variable type boolean[][][] applied to both variables
	 */
	
	
	
}
