package com.OCP81Z0808.forR;

public class Main {
	
	public static void main(String[] args) {
		
		int total = 0;
		int primeNums[] = {2, 3, 7, 11};
		
		for(int num : primeNums) {
			total += num;
			System.out.println(num);
		}

		System.out.println(total);
		
		/*
		 * StringBuilder
		 */
		System.out.println(" ");
		StringBuilder myArr[] = {
				new StringBuilder("Java"), 
				new StringBuilder("Oracle")
		};
		
		for(StringBuilder val : myArr)
			System.out.println(val);
		for(StringBuilder val : myArr)
			val.append("Loop");
		for(StringBuilder val : myArr)
			System.out.println(val);
	}

}
