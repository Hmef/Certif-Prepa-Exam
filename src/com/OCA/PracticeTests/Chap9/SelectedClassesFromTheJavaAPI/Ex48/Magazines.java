package com.OCA.PracticeTests.Chap9.SelectedClassesFromTheJavaAPI.Ex48;

import java.util.ArrayList;
import java.util.List;

public class Magazines {

	public static void main(String... args) {
		
		List<String> magazines = new ArrayList<>(); // ArrayList() without <> is the same as ArrayList<>()
		magazines.add("Readers Digest");
		magazines.add("People");
		System.out.println(magazines);
		
		// clear()
		magazines.clear();
		magazines.add("The Economist");
		System.out.println(magazines);
		
		// remove()
		magazines.remove(1);  //  
		System.out.println(magazines.size()); 
	}
	
	/*
	 * 				Exam TIP
	 * 
	 * 	Line 17: we have an arrayList with 1 element ==> size 1 
	 *  magazines.remove(1);  ==> Exception ==> IndexOutOfBoundsException: Index: 1, Size: 1
	 *  						==> try to remove an element that doesn't exist
	 *  
	 *  
	 */
	
}
