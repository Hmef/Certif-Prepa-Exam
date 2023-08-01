package com.OCP81Z0808.Exception.StringBuilder;

public class MultipleReturn {

	public static void main(String[] args) {

		MultipleReturn varr = new MultipleReturn();
		System.out.println(" in Main : " + varr.getStringBuilder());

	}

	StringBuilder getStringBuilder() {
		
		StringBuilder returnVal = new StringBuilder("10");
		
		try {
			String[] students = {"Harry","Paul"};
			System.out.println(students[5]);
			
		} catch (Exception e){
			
			System.out.println(" About to return : " + returnVal);
			return returnVal;
		} finally {
			
			returnVal.append("10");
			System.out.println(" Return value is now :  " + returnVal);
		}
		
		return returnVal;
		
	}

}
