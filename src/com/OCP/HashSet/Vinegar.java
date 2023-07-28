package com.OCP.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Vinegar {

	public static void main(String[] args) {
		
		Set<Integer> mySet= new HashSet<>();
		do1(mySet, "0");  //do1(mySet, "a");
		do2(mySet, "0");  //do2(mySet, "a");
	}
	
	public static void do1(Set s, String st) { // add argument to Set : Set<Integer>
		s.add(st);
		s.add(Integer.parseInt(st));
	}
	
	public static void do2(Set<Integer> s, String st) {
		//s.add(st);   // just Integer value 
		s.add(Integer.parseInt(st));  // Parse String to Integer 
	}
}
