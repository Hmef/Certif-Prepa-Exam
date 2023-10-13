package com.OCP81Z0809.QuestionTime.Chap2.part3;

public class ArrayStore {

	public static void main(String[] args) {
		
		Base[] baseArr = new DeriOne[3];
		baseArr[0] = new DeriOne();
		baseArr[2] = new DeriTwo(); 
		System.out.println(baseArr.length);
	}
}
