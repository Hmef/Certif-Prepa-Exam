package com.OCP81Z0808.NonaccessModifier.Static;

public class TestEmp {

	public static void main(String[] args) {
		
		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		
		emp1.bankVault = 100;
		System.out.println(" emp1.bankVault : " + emp1.bankVault);
		System.out.println(" Emp.bankVault : " + Emp.bankVault);
		emp2.bankVault = 400; // ==> the static filed should be accessed in a static way 
		
		System.out.println("");
		System.out.println("emp1.bankVault: " + emp1.bankVault);
		System.out.println("emp2.bankVault: " + emp2.bankVault);
		System.out.println("Emp.bankVault: " + Emp.bankVault);
		
		System.out.println("");
		double x = Emp.interest(1.4, 3.5, 2.456);   // non static variable = static method 
		System.out.println(" Emp.interest(1.4, 3.5, 2.456) : " + x);
		
		System.out.println("");
		double avg = Emp.averageOfFirst100Integers();
		System.out.println(" avg : " + avg);
	}
}
