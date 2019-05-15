package com.packt.example.simplemvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller @SpringBootApplication
public class SimplemvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplemvcApplication.class, args);
	}

}
