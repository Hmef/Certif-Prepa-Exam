package com.OCP81Z0808.ArrayListAll;

import java.util.ArrayList;

public class MiscMethodsArrayList3 {

	public static void main(String[] args) {
		
		ArrayList<StringBuilder> myArrList = new ArrayList<>();
		StringBuilder sb1 = new StringBuilder("Jan");
		StringBuilder sb2 = new StringBuilder("Fev");
		StringBuilder sb3 = new StringBuilder("Fev");
		
		System.out.println(sb3.equals(sb2)); // 
		
		myArrList.add(sb1);
		myArrList.add(sb2);
		myArrList.add(sb2);
		myArrList.add(sb3);
		
		System.out.println(myArrList.get(1).equals(myArrList.get(2)));
		
		System.out.println(myArrList.toString());
		
		System.out.println(myArrList.get(2));
		System.out.println(myArrList.size());
		
		System.out.println(myArrList.contains(new StringBuilder("Jan")));
		System.out.println(myArrList.contains(sb1)); 
		
		System.out.println(myArrList.indexOf(new StringBuilder("Fev")));
		System.out.println(myArrList.indexOf(sb2));
		
		System.out.println(myArrList.lastIndexOf(new StringBuilder("Fev")));
		System.out.println(myArrList.lastIndexOf(sb2));
	}
}
