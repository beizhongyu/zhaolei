package com.zl.first.test.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationWebBoot {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationWebBoot.class, args);
    }
}
