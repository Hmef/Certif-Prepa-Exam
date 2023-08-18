package com.OCP81Z0808.StringBuilder;

public class SubSequence {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("0123456");
		System.out.println(sb1.substring(2));
		System.out.println(sb1.subSequence(2, 4));  // position 2 and 3, excluding 4
		System.out.println(sb1.substring(2, 4)); // the same result 

	}
}
