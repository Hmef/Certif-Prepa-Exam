package com.OCP81Z0809.QuestionTime.Chap2.part6;

public class Test {

	public void print(Integer i) {
		
		System.out.println("Integer");
	}
	
	public void print(int i) {
		System.out.println("int");
	}
	
	public void print(long i) {
		
		System.out.println("long");
	}
	
	public static void main(String[] args) {
		
		Test test = new Test();
		test.print(10);
	}
}
