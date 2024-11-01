package com.sioli.EmailService.infra.ses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;

@Configuration
public class AwsSesConfig {

	@Value("${aws.region}")
	private String awsRegion;
	@Value("${aws.accessKeyId}")
	private String accessKeyId;
	@Value("${aws.secretKey}")
	private String secretKey;

	@Bean
	public AmazonSimpleEmailService amazonSimpleEmailService() {
		return AmazonSimpleEmailServiceClientBuilder
				.standard()
				.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKeyId, secretKey)))
				.withRegion(awsRegion)
				.build();

	}

}
