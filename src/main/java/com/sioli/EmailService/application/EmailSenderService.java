package com.sioli.EmailService.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sioli.EmailService.adapters.EmailSenderGateway;
import com.sioli.EmailService.core.EmailSenderUserCase;

@Service
public class EmailSenderService implements EmailSenderUserCase {
	
	private final EmailSenderGateway emailSenderGateway;
	
	@Autowired
	public EmailSenderService(EmailSenderGateway emailGateway) {
		this.emailSenderGateway = emailGateway;
	}
	
	@Override
	public void sendEmail(String to, String subject, String body) {
		this.emailSenderGateway.sendEmail(to, subject, body);
	}

}
