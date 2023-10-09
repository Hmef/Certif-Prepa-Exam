package com.OCP81Z0808.inheritance.casting;

import java.time.LocalDateTime;

public interface Interviewer {

	public abstract void conductInterview(); // an abstract method is defined without a method body
	public default void submitInterviewStatus() {
		System.out.println("Accept");
	}
	
	/*
	  
	  public default void submitInterviewStatus() { } // Empty method body != abstract method 
	  
	  ( the return type is void ) 
	
	 */
	
	public static void bookConferenceRoom(LocalDateTime dateTime, int duration) {
		
		System.out.println("Interviw scheduled on: " + dateTime);
		System.out.println(" Book conference room for : " + duration + "hrs");
	}
	
	/*
	 * 
	 */
	public abstract Object interviewResult();
	
	public abstract int interviewConducted();
}
