/**
 * This is the contact object class.
 * It is responsible for the contact form on the portfolio, if someone wants to send a message, they can create this contact object for it.
 */
package com.hannah.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Contact {
    //attributes of a contact
    private String name;
    private String email;
    private String message;
}
