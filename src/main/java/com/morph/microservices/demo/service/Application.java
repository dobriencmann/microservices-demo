package com.morph.microservices.demo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.morph.microservices.demo.controller.GreetingController;

@SpringBootApplication
@ComponentScan(basePackageClasses=GreetingController.class)
public class Application {
	
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

}
