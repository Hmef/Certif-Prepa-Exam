package com.OCP81Z0808.ArrayListAll;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> myArrList = new ArrayList<>();
		myArrList.add("One");
		myArrList.add("Two");
		
		// get(int index) & size() 
		String valFromList = myArrList.get(1); // get Element at position 1
		System.out.println(valFromList);
		System.out.println(myArrList.size());  // size()
		
		// contains(Object o) 
		boolean testContain = myArrList.contains("Two");
		System.out.println(testContain);
		
		// indexOf(Object o)
		int indexOfTest = myArrList.indexOf(valFromList);
		System.out.println(indexOfTest);
		
		// lastIndexOf(Object o)
		int lastIndexOfTest = myArrList.lastIndexOf("One"); 
		System.out.println(lastIndexOfTest);
		System.out.println(myArrList.lastIndexOf("Hello")); 
	}
}
