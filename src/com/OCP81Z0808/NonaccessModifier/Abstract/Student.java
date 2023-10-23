package com.OCP81Z0808.NonaccessModifier.Abstract;

public class Student extends Person {

	Student() {
		System.out.println(" Constructor - Student ");
	}
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
		System.out.println(" abstract method ");
	}

}
