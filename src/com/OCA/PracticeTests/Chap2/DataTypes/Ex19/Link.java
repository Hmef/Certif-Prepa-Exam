package com.OCA.PracticeTests.Chap2.DataTypes.Ex19;

public class Link {

	
	private String name;
	private Link next;
	
	public Link(String name, Link next) {
		
		this.name = name;
		this.next = next;
	}
	
	// set() method
	public void setNext(Link next) {
		
		this.next = next;
	}
	
	// get() method
	public Link getNext() {
		
		return next;
	}
	
	
	public static void main(String[] args) {
		
		Link link1 = new Link("x", null);
		Link link2 = new Link("y", link1);
		Link link3 = new Link("z", link2);
		link2.setNext(link3);
		link3.setNext(link2);
		link1 = null;
		link3 = null;
		
		/*
		 * 		Which is the state of the references right before the end 
		 * 		of the main method, assuming garbage collection hasn't run 
		 */
	}
}
