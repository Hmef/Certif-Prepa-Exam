package com.OCP81Z0808.ArrayList.nestedArrayList;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> exams = new ArrayList<String>();
		exams.add("Java");
		exams.add("Oracle");
		
		ArrayList<String> levels = new ArrayList<String>();
		levels.add("Basic");
		levels.add("Advanced");
		
		ArrayList<String> grades = new ArrayList<String>();
		grades.add("Pass");
		grades.add("Fails");
		
		/*
		 * Nested ArrayList
		 */
		
		ArrayList<ArrayList<String>> nestedArrayList = new ArrayList<ArrayList<String>>();
		nestedArrayList.add(exams);
		nestedArrayList.add(levels);
		nestedArrayList.add(grades);
		
		for(ArrayList<String> nestedListElement : nestedArrayList)
			for(String element : nestedListElement)
				System.out.println(element);

	}

}
