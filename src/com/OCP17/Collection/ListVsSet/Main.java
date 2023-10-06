package com.OCP17.Collection.ListVsSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Collection ==> List - Queue - Set 
		 * 
		 * List ==> ArrayList - LinkedList 
		 * 
		 * Set ==> HashSet - TreeSet
		 * 
		 * Queue ==> Deque 
		 * 
		 */
		
		// List Vs Set 
		Collection<String> list = new ArrayList<>();
		System.out.println(list.add("Sparrow")); // true 
		System.out.println(list.add("Sparrow")); // true 
		
		Collection<String> set = new HashSet<>();
		System.out.println(set.add("Sparrow"));
		System.out.println(set.add("Sparrow"));
		
		/*
		 * Exam TIP : 
		 * 
		 * ==> a List allows duplicates 
		 * 
		 * ==> a Set Does not allow duplicates  
		 */
		
		System.out.println(" Removing Data  ");
		
		// Removing Data 
		Collection<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.remove("cardinal"));
		System.out.println(birds.remove("hawk"));
		System.out.println(birds);
		
		System.out.println("  Counting Elements  ");
		
		// Counting Eelements 
		
		Collection<String> birdsList = new ArrayList<>();
		System.out.println(birdsList.isEmpty());
		System.out.println(birdsList.size());
		birdsList.add("hawk");
		birdsList.add("hawk");
		System.out.println(birdsList.isEmpty());
		System.out.println(birdsList.size());
		
	}
}
