package com.revature.dockerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.revature.dockerDemo.beans")
public class DockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
		System.out.println("\n\n====================\nApplication started");
		System.out.println("Docker Demo 1.0");
		System.out.println("====================");
	}

}
