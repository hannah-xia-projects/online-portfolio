package com.hannah.backend.service;

import com.hannah.backend.model.Contact;
import org.springframework.stereotype.Service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Service
public class ContactService {

    /**
     * a method that processes messages from post commands on frontend
     * when someone sends a message, process it here
     * @param contact the contact object being filled
     */
    public void processMessage(Contact contact) {
        System.out.println("---- New Message ----");
        System.out.println("Name: " + contact.getName());
        System.out.println("Email: " + contact.getEmail());
        System.out.println("Message: " + contact.getMessage());
    }
}
