package com.OCP.Internet.TCPIP;

public class Internet {

	private int y = 8;

	/*
	public Internet(int y) {
		this.y = y;
	}*/

	public static void main(String[] args) {

		Internet internet = new Internet();
		internet.go();
	}

	void go() {
		int x = 7;
		class TCPIP {
			void doit() {
				System.out.println(y + x);
			}
		}
		TCPIP ip = new TCPIP();
		ip.doit();

	}

}
