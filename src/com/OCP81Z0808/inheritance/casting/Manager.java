package com.OCP81Z0808.inheritance.casting;

public class Manager implements Interviewer {

	@Override
	public void conductInterview() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String interviewResult() {   // public Object interviewResult() 
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int interviewConducted() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String submitInterviewStatus() {
		
		System.out.println("Accept");
		return null;
	}

	/*
	 * Exam TIP 
	 * 
	 *  - When Overriding a default method, we must not use the keyword default.
	 * 
	 *  - Rules for overriding default and regular methods are the same 
	 *  
	 */
	
}
