package com.OCA.PracticeTests.Chap5.loop.Ex17;

public class Main {
	
	public static void main(String[] args) {
		
		do {
			int count = 0;
			do {
				count++;
			} while(count < 2); 
			break;
		} while(true);
		System.out.println(count); //
	}

	
}
