package com.OCA.PracticeTests.Chap5.loop.Ex12;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> drinks = Arrays.asList("can","cup");
		
		for(int container = drinks.size() - 1; container >= 0; container--)
			System.out.println(drinks.get(container) + ",");
		
	}
}
