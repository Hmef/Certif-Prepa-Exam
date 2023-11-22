package com.OCA.PracticeTests.Chap9.SelectedClassesFromTheJavaAPI.Ex43;

public class Test {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Test");
		secret(sb);
	}
	
	public static void secret(StringBuilder mystery) {
		
		char ch = mystery.charAt(3);
		
		System.out.println(mystery.length()); // 4
		
		// insert()
		mystery = mystery.insert(1, "more");
		System.out.println(mystery);
		int num = mystery.length();
		System.out.println(num);  // 8 ==> after insert() method 
		
	}
}
