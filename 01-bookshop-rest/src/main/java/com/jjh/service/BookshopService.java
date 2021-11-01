package com.jjh.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collections;

@SpringBootApplication
public class BookshopService {
    public static void main(String[] args) {
        System.out.println("Starting Bookshop Service");
        SpringApplication app = new SpringApplication(BookshopService.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8085"));
        app.run(args);
        System.out.println("Setup finished");
    }
}
