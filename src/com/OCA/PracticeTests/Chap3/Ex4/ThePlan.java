package com.OCA.PracticeTests.Chap3.Ex4;

public class ThePlan {

	public static void main(String[] input) {

		int plan = 1;

		// post-increment and pre-decrement
		plan = plan++ + --plan;
		System.out.println(plan);

		if (plan == 1) {
			System.out.println("Plan A");
		} else if (plan == 2) {
			System.out.println("Plan B");
		} else
			System.out.println("Plan C");
	}

	
}
