package com.example.sweater.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {
    @Value("${spring.mail.host}")
    private String host;
    

    @Bean
    public JavaMailSender getMailSender() {
        JavaMailSender mailSender = new JavaMailSenderImpl();

        return mailSender;
    }
}
