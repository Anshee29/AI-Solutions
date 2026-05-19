package org.example.service;

import org.example.model.ContactRequest;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    public String saveMessage(ContactRequest request) {

        // You can save to database here

        return "Message received from " + request.getName();
    }

}
