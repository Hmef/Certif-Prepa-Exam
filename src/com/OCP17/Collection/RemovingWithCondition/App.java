package com.OCP17.Collection.RemovingWithCondition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		
		Collection<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		System.out.println(list);
		
		System.out.println("      Removing with Condition      ");
		
		/*
		 * public boolean removeIf(Predicate<? super E> filter)
		 */
		
		list.removeIf(s -> s.startsWith("A"));
		System.out.println(list);
		
		/*
		 * Example with method reference
		 */
		
		System.out.println("set.removeIf(String::isEmpty)");
		
		Collection<String> set = new HashSet<>();
		set.add("Wand");
		set.add("");
		set.removeIf(String::isEmpty);  // s -> s.isEmpty();
		System.out.println(set);
	}
}
