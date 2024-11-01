package com.sioli.EmailService.adapters;

public interface EmailSenderGateway {
	
	public void sendEmail(String to, String from, String body);
}
