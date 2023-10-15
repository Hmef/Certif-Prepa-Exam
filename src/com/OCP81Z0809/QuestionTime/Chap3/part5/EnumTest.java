package com.OCP81Z0809.QuestionTime.Chap3.part5;

public class EnumTest {

	PrinterType printerType;
	
	enum PrinterType {INKJET, DOTMATRIX, LASER};
	
	EnumTest(PrinterType pType){
		
		printerType = pType;
	}
	
	public static void main(String[] args) {
		
		//PrinterType pType = new PrinterType():
		EnumTest enumTest = new EnumTest(PrinterType.DOTMATRIX);
	}
}
