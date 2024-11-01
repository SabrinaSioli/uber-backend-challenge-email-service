package com.sioli.EmailService.core;

public record EmailRequest(String to, String subject, String body) {

}
