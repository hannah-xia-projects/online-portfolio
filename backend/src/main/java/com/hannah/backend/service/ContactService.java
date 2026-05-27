package com.hannah.backend.service;

import com.hannah.backend.model.Contact;
import org.springframework.stereotype.Service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Service
public class ContactService {

    private final JavaMailSender mailSender;

    public ContactService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    /**
     * a method that processes messages from post commands on frontend
     * when someone sends a message, process it here
     * @param contact the contact object being filled
     */
    public void processMessage(Contact contact) {
        SimpleMailMessage message = new SimpleMailMessage(); //use simpleMailMessage to create a message

        //to check for spam, make sure message isn't too long
        if (contact.getMessage().length() > 1000) {
            throw new RuntimeException("Message too long");
        }

        //basic spam filter (links), throw errors if there are links
        String msg = contact.getMessage().toLowerCase(); //make sure to convert to lower case in case they do capital
        if (msg.contains("http://") || msg.contains("https://")) {
            throw new RuntimeException("Links are not allowed");
        }

        //because of security, SMTP will often reject or flag if it's sent by the contact's email. so send using own email
        message.setFrom("hannahxia95@gmail.com"); //sender = your app
        message.setTo("hannahxia95@gmail.com"); //business email set to
        message.setReplyTo(contact.getEmail()); //reply goes to user
        message.setSubject("New Contact Form Submission from " + contact.getName());
        message.setText("Name: " + contact.getName() + "\n" +
                        "Email: " + contact.getEmail() + "\n\n" +
                        "Message:\n" + contact.getMessage());

        mailSender.send(message);

        System.out.println("---- New Message ----");
        System.out.println("Name: " + contact.getName());
        System.out.println("Email: " + contact.getEmail());
        System.out.println("Message: " + contact.getMessage());
    }
}
