package com.OCP81Z0808.NonaccessModifier.Static;

public class TestEmp {

	public static void main(String[] args) {
		
		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		
		emp1.bankVault = 100;
		emp2.bankVault = 400;
		
		System.out.println("emp1.bankVault: " + emp1.bankVault);
		System.out.println("emp2.bankVault: " + emp2.bankVault);
		System.out.println("Emp.bankVault: " + Emp.bankVault);
	}
}
