package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ContextConfiguration;

@SpringBootApplication
//this annotation wouldn't be there for 
public class Application {
public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
}
}
