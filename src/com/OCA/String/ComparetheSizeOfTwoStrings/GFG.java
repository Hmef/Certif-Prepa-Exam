package com.OCA.String.ComparetheSizeOfTwoStrings;

public class GFG {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "xyz";
		
		// Storing the length of the string in the int variable
		int len1 = s1.length();
		int len2 = s2.length();
		
		// Comparing the two lengths
		if(len1 == len2) {
			
			System.out.println(" The length of the both strings are equals and is " +len1);
		}
		else {
			
			System.out.println("the length of the both strings are not equal");
		}
	}
}
