package com.OCA.PracticeTests.Chap9.SelectedClassesFromTheJavaAPI.Ex42;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(1);
		
		// remove() 
		list.remove(2);
		System.out.println(list);
	}
	
	
}
