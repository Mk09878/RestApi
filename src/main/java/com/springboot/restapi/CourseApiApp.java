package com.springboot.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Tells spring boot that this class is the starting point of the application
public class CourseApiApp {
    public static void main(String[] args) {
        SpringApplication.run(com.springboot.restapi.CourseApiApp.class, args);
    }
}
