package com.OCP81Z0808.ScopeOfVariables.LocalVariables;

public class Student {

	private double marks1, marks2, marks3;  // instance variables
	private double maxMarks = 100;       // instance variable
	
	public double getAverage() {
		
		//double avg = 0;  
		
		if(maxMarks > 0) {
			double avg = 0;  //  ==> local variable aavg
			avg = ((marks1 + marks2 + marks3) / (maxMarks * 3)) * 100;
			return avg;
		}
		else {
			avg = 0;   // the scope of local variable avg is part of the if statement 
			return avg;
		}
	}
	
	public void setAverage(double val) {
		//avg = val;   // this code won't compile because avg is inaccessible  outside the method getAverage()
	}
}
