package com.OCP81Z0808.Exception.TryFinally;

public class NoCatchOnlyFinally {

	public static void main(String[] main) {
		
		String name = null;
		
		try {
			System.out.println("try block : open ressource 1");
			System.out.println("try block : open ressource2");
			System.out.println("in try : " + name.length());
			System.out.println("try block : close ressource");
			
		} finally {
			// TODO: handle finally clause
			System.out.println("finally : close ressource");
		}
	}
}
