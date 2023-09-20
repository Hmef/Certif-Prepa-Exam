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
	}

}
