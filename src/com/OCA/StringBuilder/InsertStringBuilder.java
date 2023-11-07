package com.OCA.StringBuilder;

public class InsertStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("jaa");
		sb1.insert(2, "v");
		System.out.println(sb1);
		
		// ********* Exam TIP *********
		StringBuilder sb2 = new StringBuilder("123");
		char[] name = {'j','a','v','a'};
		sb2.insert(1, name, 1, 3); // insert multiple characters
		System.out.println(sb2); 
		
	}
}
