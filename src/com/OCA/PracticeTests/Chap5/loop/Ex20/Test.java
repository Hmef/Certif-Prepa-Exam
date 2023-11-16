package com.OCA.PracticeTests.Chap5.loop.Ex20;

import java.util.Arrays;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<String> drinks = Arrays.asList("can","cup");
		
		for(int container = 0; container < drinks.size(); container++) {
			
			System.out.println(drinks.get(container) + ",");
		}
	}
	
	/*
	 * 						Exam TIP
	 *  
	 *  	size() for List             length variable for Array
	 */

}
