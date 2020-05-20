package com.example.demo.db;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;
 
@Component
public class SmtpCompoent {
    
	
    @Bean
    public JavaMailSenderImpl javaMailSender()
    {
        JavaMailSenderImpl r = new JavaMailSenderImpl();
        r.setHost("smtp.gmail.com");
        r.setPort(587);
        r.setUsername("campingspot12345");
        r.setPassword("camp12345678");
        r.setDefaultEncoding("UTF-8");
        
        Properties prop = new Properties();
        prop.put("mail.smtp.starttls.enable", true);
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.ssl.checkserveridentity", true);
        prop.put("mail.smtp.ssl.trust","*");
        r.setJavaMailProperties(prop);
        
        return r;
    }   
       
}

