package com.OCP81Z0808.AccessModifier.Private.library;

public class Book {

	public String isbn;
	protected String author;
	
	
	public void printBook() {
		
	}
	
	private void countPages() {}
	
	protected void modifyTemplate() {
		
		countPages(); // ==> only Book can access its own private method coutPages()
	}
}
