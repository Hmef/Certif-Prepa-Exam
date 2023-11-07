package com.OCA.PracticeTests.Chap5.loop.Ex13;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> bottles = Arrays.asList("glass","plastic");
		
		for(int type = 0; type < bottles.size();) {
			
			System.out.println(bottles.get(type) + ",");
			break;
		}
		
		System.out.println("end");
	}
}
