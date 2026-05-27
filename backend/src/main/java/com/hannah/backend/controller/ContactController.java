package com.hannah.backend.controller;

import com.hannah.backend.model.Contact;
import com.hannah.backend.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:5173") //allow requests coming from frontend url
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    /**
     * the post function that will print a simple message once the contact is sent
     * @param request the contact request being sent by the user to host
     * @return a successfully sent message
     */
    @PostMapping
    public String submitContact(@Valid @RequestBody Contact request) { //make sure the request is valid
        contactService.processMessage(request);

        return "Message sent successfully!";
    }
}
