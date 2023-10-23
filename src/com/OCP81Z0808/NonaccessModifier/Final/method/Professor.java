package com.OCP81Z0808.NonaccessModifier.Final.method;

public class Professor extends Person {

	public void sing() {
		System.out.println("Alpha.. beta.. gamma"); // a final method defined in a base class can't be Overridden by a derived class
	}
}
