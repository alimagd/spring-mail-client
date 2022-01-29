package com.magd.springmailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringMailClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMailClientApplication.class, args);
    }

    @Autowired
    private EmailSenderService service;

    // TODO Simple email without attached
//	@EventListener(ApplicationReadyEvent.class)
//	public void triggerMail() {
//		service.sendSimpleEmail("iamjava20@gmail.com",
//				"This is a dashaq body....",
//				"Dashaaaaq");
//
//	}
    // TODO with attached file
    @EventListener(ApplicationReadyEvent.class)
    public void triggerMail() throws MessagingException {
        service.sendEmailWithAttachment("iamjava20@gmail.com",
                "This is a dashaq body with Am-attached....",
                "Dashaaaaq attached Am",
                "C:\\Users\\Ali\\Pictures\\mylove.jpeg");

    }
}
