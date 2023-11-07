package com.OCA.PracticeTests.Chap4.Arrays.Ex29;

import java.util.Arrays;

public class Main {

	public static void main(String...args) {
		
		String[] os = new String[] {"Mac", "Linux", "Windows"};
		
		// Arrays.sort()
		Arrays.sort(os);
		
		// Arrays.binarySearch()  
		System.out.println(Arrays.binarySearch(os, "Red")); // Arrays with S 
		
		//
		System.out.println(os.length);  // ==> length without ()
		
		System.out.println(Arrays.binarySearch(os, "Mac"));
		
		System.out.println(Arrays.binarySearch(os, "Linux"));

	}
	
	/*
	 * 					Exam TIP 
	 * 
	 * 			if it was found, the index of "Mac" would be 2 ==> the rule is to take the negative index of where 
	 * 
	 * 															it would be inserted and subtract 1 ==> -2 -1 ==> -3
	 */
}
