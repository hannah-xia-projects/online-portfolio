/**
 * This is the contact object class.
 * It is responsible for the contact form on the portfolio, if someone wants to send a message, they can create this contact object for it.
 */
package com.hannah.backend.model;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
public class Contact {
    //attributes of a contact
    @NotBlank //for security and to prevent bot spam, use not blank and email
    private String name;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String message;
}
