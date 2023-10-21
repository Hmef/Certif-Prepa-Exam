package com.OCP81Z0808.AccessModifier.Default.library;

 class Book {

	public String isbn;
	protected String author;
	
	// default member 
	int issueCount;
	
	
	public void printBook() {
		
	}
	
	private void countPages() {}
	
	protected void modifyTemplate() {
		
		countPages(); 
	} 
	// default member 
	void issueHistory() {};
}
