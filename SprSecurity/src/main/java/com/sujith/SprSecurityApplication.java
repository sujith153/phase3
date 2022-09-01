package com.sujith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sujith")
public class SprSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprSecurityApplication.class, args);
	}

}
