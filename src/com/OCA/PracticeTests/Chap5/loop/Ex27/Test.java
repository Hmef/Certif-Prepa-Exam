package com.OCA.PracticeTests.Chap5.loop.Ex27;

public class Test {

	public static void main(String[] args) {
		
		boolean balloonInflated = false;
		
		do {
			if(!balloonInflated) {
				balloonInflated = true;
				System.out.println("inflate-");
				
			}
			
		} while(!balloonInflated);
		System.out.println("done");
	}
}
