package com.OCP81Z0808.Exception.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CaseBaseExceptionBeforeDerived {

	public static void main(String[] args) {
		
		FileInputStream fil = null;
		
		try {
			
			fil = new FileInputStream("file.txt");
			fil.close();
		} catch(IOException ioe) {
			
			System.out.println("IOException");
		} catch(FileNotFoundException fnfe) { // Exception : Unreachable catch block for FileNotFoundException 
											  // It is already handled by the catch block for IOException
			System.out.println("file not found"); 
		}
	}
}
