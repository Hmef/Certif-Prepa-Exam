package com.OCP81Z0808.StringBuilder;

public class ReplaceStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("0123456");
		sb1.replace(2, 4, "ABCD"); // 2, 4 ==> position 2 and 3 - Excluding 4
		System.out.println(sb1); // 01ABCD456
		
		
		// replace() in String   Vs   replace() in StringBuilder

	}
}
