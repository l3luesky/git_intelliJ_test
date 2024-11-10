package com.startwith906.post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PostApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostApplication.class, args);

		System.out.println("### TEST ###");


	}

}

@RestController
class HelloController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello, World!";
	}
}