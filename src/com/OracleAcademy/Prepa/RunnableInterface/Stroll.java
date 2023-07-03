package com.OracleAcademy.Prepa.RunnableInterface;

public class Stroll {

	// page 20
	public static void main(String[] args) {
		//Mosey m = new Mosey();
		//m.run();
		
		Thread t1 = new Thread(new Mosey());
		// added code - test
		t1.setPriority(1);
		new Mosey().run();
		t1.start();
	}
}
