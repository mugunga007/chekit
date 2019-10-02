package com.springit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springit.model.Link;

@SpringBootApplication
public class SpringitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	
	}
	
	@Bean
	// @Profile("dev") 
	CommandLineRunner runner() {
		return args->{
		//	Link link = new Link("","");
		//	System.out.println("What up");
		};
	}

}
