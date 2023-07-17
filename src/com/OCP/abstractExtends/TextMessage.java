package com.OCP.abstractExtends;

public class TextMessage extends Message{

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println(" Text message to " + recipient);
	}

}
