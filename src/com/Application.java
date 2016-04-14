package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//@EnableScheduling
public class Application extends SpringBootServletInitializer{
	
	@RequestMapping("/")
	String index(){
		return "spring boot is started!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
