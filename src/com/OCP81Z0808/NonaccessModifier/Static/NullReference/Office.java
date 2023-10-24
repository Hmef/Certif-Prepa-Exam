package com.OCP81Z0808.NonaccessModifier.Static.NullReference;

public class Office {

	public static void main(String[] args) {
		
		Emp emp = null;
		
		System.out.println("emp.bankVault ==> " + emp.bankVault);
		System.out.println("Emp.bankVault ==> " + Emp.bankVault);
		
		Emp.bankVault = 500;
		
		System.out.println(emp.getBankVaultValue());
		
		
	}
	
	/*
	 *  Exam TIP ==> we can access static variables and methods using a Null reference
	 */
}
