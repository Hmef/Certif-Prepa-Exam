package com.OCP.Thread;

public class Jump {

	static Paratrooper p;
	static {
		p = new Paratrooper();
	}
	{
		Thread t1 = new Thread(p, "bob");
		t1.start();
	}
	
	public static void main(String[] args) {
		
		new Jump();
		new Thread( new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			; }}, "carol").start();
		
		new Thread( new Paratrooper(), "alice").start();
	}
	
	public Jump() {
		// TODO Auto-generated constructor stub
		Thread t2 = new Thread(p, "ted");
		t2.start();
		
	}
}
