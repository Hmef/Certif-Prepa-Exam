package com.OCP81Z0808.Arrays.AnonymousArrays;

public class AnonArray {

	public static void main(String[] args) {
		
		System.out.println(" Minimum value : " + findMinimum( new int[] {3, 9, 3, 2, 5}));
	}
	
	public static int findMinimum(int[] dataSeq) {
		
		int min = dataSeq[0];
		for(int index = 0; index < dataSeq.length; ++index)
			if(dataSeq[index] < min)
				min = dataSeq[index];
		
		return min;
	}
}
