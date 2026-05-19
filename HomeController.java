package org.example.Controller;

import org.example.model.ContactRequest;
import org.example.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping("/api")
    @CrossOrigin(origins = "*")
    public class HomeController {

        @Autowired
        private ContactService contactService;

        // Homepage API
        @GetMapping("/home")
        public String home() {
            return "Welcome to Keyword AI Solutions Backend";
        }

        // Company Details API
        @GetMapping("/company")
        public String companyInfo() {
            return """
                {
                    "company":"Keyword AI Solutions",
                    "services":[
                        "Digital Marketing",
                        "AI Solutions",
                        "Software Development"
                    ],
                    "country":"India"
                }
                """;
        }

        // Contact Form API
        @PostMapping("/contact")
        public String contact(@RequestBody ContactRequest request) {

            return contactService.saveMessage(request);
        }
    }


