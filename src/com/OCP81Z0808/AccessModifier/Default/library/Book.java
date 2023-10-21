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
	
	/*
	 * 
	 * 		Exam TIP : protected Vs default 
	 * 
	 * 					default access ==> package-private: accessible only whithin a package 
	 * 
	 * 					protected access ==> package-private + kids ("kids" refers to ==> derived classes)
	 * 
	 * 									kids can only access protected method Only by inheritance and not by Reference
	 * 
	 * 									reference : accessing members by using the dot operator on an object ( book.isbn )
	 */
}
 
 
