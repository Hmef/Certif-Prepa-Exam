package com.OCP81Z0808.Comparable;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Pair pair1 = new Pair("raj", "kashup");
		Pair pair2 = new Pair("rahul", "singh");
		Pair pair3 = new Pair("reshmi", "dubey");
		Pair pair4 = new Pair("rahul", "jetli");

		Pair[] arr = new Pair[4];
		arr[0] = pair1;
		arr[1] = pair2;
		arr[2] = pair3;
		arr[3] = pair4;

		print(arr);  // before sort() method 
		
		Arrays.sort(arr);
		System.out.println(" ");
		print(arr); // after sort() method 

		
		/*
		 * compareTo() 
		 * if(this.firstName.compareTo(o.firstName) != 0) {
			return this.firstName.compareTo(o.firstName);
		} 
		else {
			// on compare les lastNames si les firstNames sont égaux 
			return this.lastName.compareTo(o.lastName);
		}
		 */
		
	}

	public static void print(Pair[] arr) {
		for (Pair i : arr) {
			System.out.println(i);
		}
	}
}
