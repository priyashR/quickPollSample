package com.apress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mangofactory.swagger.plugin.EnableSwagger;

@SpringBootApplication
public class QuickPollApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickPollApplication.class, args);
    }
}
