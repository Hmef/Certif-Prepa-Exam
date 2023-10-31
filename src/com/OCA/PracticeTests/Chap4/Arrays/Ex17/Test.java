package com.OCA.PracticeTests.Chap4.Arrays.Ex17;

import java.util.Arrays;

public class Test {

	public static void main(String... args) {
		
		String[] os = { "Mac", "Linux", "Windows"};
		
		Arrays.sort(os);
		
		System.out.println(Arrays.binarySearch(os, "Mac"));
		System.out.println(Arrays.binarySearch(os, "Windows"));
	}
}
