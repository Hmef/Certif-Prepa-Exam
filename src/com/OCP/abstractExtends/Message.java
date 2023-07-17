package com.OCP.abstractExtends;

public abstract class Message {

	public String recipient;
	public abstract void sendMessage();
	
	/*
	public static void main() {
		
		TextMessage m = new TextMessage();
		m.recipient = "123456799";
		m.sendMessage();
	}
	
	*/
}
