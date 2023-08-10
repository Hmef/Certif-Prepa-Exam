package com.OCP81Z0808.StringBuilder;

public class ReverseStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("0123456");
		sb1.reverse();
		System.out.println(sb1);
	}
	
	// *********** Exam TIP ***********
	//we can't use a reverse() method to reverse a substring of StringBuilder 
}
