package com.OCA.StringBuilder;

public class DeleteStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("0123456");
		sb1.delete(2, 4); // Exam TIP ( removing characters at position starting from 2 to 4 - Excluding 4 )
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("0123456");
		sb2.deleteCharAt(2);
		System.out.println(sb2);
	}
	
	// *********** Exam TIP ***********
	
	// Combinations of the deleteCharAt() and insert() methods can be quite confusing !! 
	
	// trim() : the class StringBuilder doesn't define the method trim() 
	
}
