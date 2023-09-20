package com.OCP81Z0808.switchVsIfElse;

public class Main {
	
	public static void main(String[] args) {
		
		String day = "SUN";
		if(day.equals("MON") || day.equals("TUE") || day.equals("WED") || day.equals("THU"))
			System.out.println("Time to work");
		else if(day.equals("FRI"))
			System.out.println("Nearing weekend");
		else if(day.equals("SAT") || day.equals("SUN"))
			System.out.println("Weekend");
		else 
			System.out.println("Invalid day !!");
		
		/*
		 *  switch part 
		 */
		
		String jour = "SAT";
		switch(jour) {
			case "MON":
			case "TUE":
			case "WED":
			case "THU": System.out.println("Time to work");
				break;
			case "FRI": System.out.println("Nearing weekend");
				break;
			case "SAT":
			case "SUN": System.out.println("Weekend");
				break;
			default: System.out.println("Invalid day !");
		
		}
		
		/*
		 * Exam Tip 
		 */
		
		System.out.println(" ********* Exam TIP ********* ");
		
		int score = 10, num = 20;
		switch(score+num) {
			case 10 : System.out.println("10");
				break;
			case 20 : System.out.println("20");
				break;
			case 30: System.out.println("30 ==> score+num ");
				break;
			default : System.out.println("default");
		}
		
		
		
	}

}
