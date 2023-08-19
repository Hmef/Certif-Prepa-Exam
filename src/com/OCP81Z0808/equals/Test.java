package com.OCP81Z0808.equals;

public class Test {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		b1.acctNumber = "0234565";
		b1.acctType = 4;
		
		BankAccount b2 = new BankAccount();
		b2.acctNumber = "11223344";
		b2.acctType = 3;
		
		BankAccount b3 = new BankAccount();
		b3.acctNumber = "11223344";
		b3.acctType = 3;
		
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b3));
		System.out.println(b1.equals(new String("abc")));
		
		// ****** Exam TIP ****** part 2
		System.out.println(" ======= Part 2 ======= ");
		BankAccount2 bank = new BankAccount2();
		String str = "Bank";
		System.out.println(bank.equals(str));
		System.out.println(str.equals(bank));
		
	}
}
