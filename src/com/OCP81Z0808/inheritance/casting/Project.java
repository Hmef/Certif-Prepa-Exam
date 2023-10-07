package com.OCP81Z0808.inheritance.casting;

import java.time.LocalDateTime;

public class Project {

	public static void main(String[] args) {
		
		Interviewer inv = new Manager();
		//inv.bookConferenceRoom(LocalDateTime.now(), 2); // doesn't compile 
		
		Manager mgr = new Manager();
		//mgr.bookConferenceRoom(LocalDateTime.now(), 2); // doesn't compile 
		
		Interviewer.bookConferenceRoom(LocalDateTime.now(), 2); // Interviewer.static method 
		
		Employee emp = new Employee();
		emp.defaultPlan();
		
		Programmer pgr = new Programmer();
		pgr.defaultPlan();
		
		
		Employee.defaultPlan();
		Programmer.defaultPlan();
		
		/*
		 * Exam TIP : to execute defaultPlan() (static method), we can use the reference variables emp and pgr 
		 * 
		 * also 
		 * 
		 * calls defaultPlan() using the class name - Employee - Programmer 
		 * 
		 */
	}
}
