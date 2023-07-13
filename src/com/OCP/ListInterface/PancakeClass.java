package com.OCP.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class PancakeClass implements Pancake {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("3");
		list1.add("5");
		list1.add("7");
		
		System.out.println(" Before method's call ==> " + list1 );
		
		List<String> list2 = new PancakeClass().pancakeMethod(list1);
		list2.add("1");
		System.out.println(" After the method's call ==> " + list1);
		System.out.println(" list2 ==> " + list2);
	}
	
	@Override
	public List<String> pancakeMethod(List<String> list) {
		// TODO Auto-generated method stub
		list.add("9");
		System.out.println(" Content of doStuff method ==> " + list);
		return list;
	}

}
