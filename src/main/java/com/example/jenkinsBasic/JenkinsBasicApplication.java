package com.example.jenkinsBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsBasicApplication {

	@GetMapping("/")
	public String name() {
		return "Rishi";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsBasicApplication.class, args);
	}

}
