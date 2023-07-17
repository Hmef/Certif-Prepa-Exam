package com.OCP.abstractExtends;

public class Main {

	public static void main(String[] args) {
		
		Message m = new TextMessage();
		m.recipient = "123456799";
		m.sendMessage();
	}
}
