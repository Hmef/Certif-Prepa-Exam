package com.OCP81Z0808.ArrayList.MultipleElements;

import java.util.ArrayList;

public class MultipleElementsAddTest {

	public static void main(String[] args) {
		
		ArrayList<String> myArrList = new ArrayList<String>();
		myArrList.add("One");
		myArrList.add("Two");
		
		ArrayList<String> yourArrList = new ArrayList<>();
		yourArrList.add("Three");
		yourArrList.add("Four");
		
		myArrList.addAll(1, yourArrList); // add elements of yourArrList to myArrList
		
		for(String elem : myArrList)
			System.out.println(elem);
		
		//System.out.println(myArrList.toString());
		
		myArrList.clear();
		yourArrList.clear();
		
		
		// ******** Exam TIP ********
		
		ArrayList<String> myArrList2 = new ArrayList<>();
		
		String one = "One";
		String two = new String("Two");
		myArrList2.add(one);
		myArrList2.add(two);
		
		ArrayList<String> yourArrList2 = myArrList2; 
		
		one.replace("O", "B");
		
		for(String elem : myArrList2)
			System.out.print(elem + ":");
		
		for(String elem : yourArrList2)
			System.out.print(elem + ":");
	}
	
	
	/*
	 *  addAll(Collection<? extends E> c); 
	 *  
	 *  addAll(int index; Collection<? extends E> c);
	 *
	 */
	
	/*
	 * Exam TIP: What happens if we modify the common objects references in these lists, myArrList & yourArrList ?
	 * 
	 */
}
