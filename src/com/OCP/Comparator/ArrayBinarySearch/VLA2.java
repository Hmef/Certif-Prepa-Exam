package com.OCP.Comparator.ArrayBinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class VLA2 implements Comparator<VLA2>{

	int dishSize;
	
	public static void main(String[] args) {
		
		VLA2[] va =  { new VLA2(10), new VLA2(100), new VLA2(50)};
				
		Arrays.sort(va, va[0]); // Arrays with S
		int index = Arrays.binarySearch(va, new VLA2(10), va[0]);
		System.out.println(index + "");
		index = Arrays.binarySearch(va, new VLA2(20), va[0]);
		System.out.println(index);
		
	}

	@Override
	public int compare(VLA2 o1, VLA2 o2) {
		// TODO Auto-generated method stub
		System.out.println(" o2.dishSize ==> " + o2.dishSize);
		return o2.dishSize - o1.dishSize;
	}
	
	public VLA2(int d) {
		dishSize = d;
	}
	
}
