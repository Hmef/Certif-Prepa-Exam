package com.OCP81Z0808.Comparable;

public class Pair implements Comparable<Pair>{

	private String firstName;
	private String lastName;
	
	public Pair(String x, String y) {
		
		this.firstName = x;
		this.lastName = y;
	}
	
	public String toString() {
		
		return "(" + firstName + "," + lastName + ")";
	}
	
	@Override
	public int compareTo(Pair o) {
		// TODO Auto-generated method stub
		if(this.firstName.compareTo(o.firstName) != 0) {
			return this.firstName.compareTo(o.firstName);
		} 
		else {
			// on compare les lastNames si les firstNames sont égaux 
			return this.lastName.compareTo(o.lastName);
		}
	}

}
