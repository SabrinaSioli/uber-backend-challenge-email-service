package com.sioli.EmailService.core;

public interface EmailSenderUserCase {
	void sendEmail(String to, String from, String body);
}
