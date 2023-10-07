package com.OCP81Z0808.inheritance.casting;

import java.time.LocalDateTime;

public class Project {

	public static void main(String[] args) {
		
		Interviewer inv = new Manager();
		//inv.bookConferenceRoom(LocalDateTime.now(), 2); // doesn't compile 
		
		Manager mgr = new Manager();
		//mgr.bookConferenceRoom(LocalDateTime.now(), 2); // doesn't compile 
		
		Interviewer.bookConferenceRoom(LocalDateTime.now(), 2); // Interviewer.static method 
	}
}
