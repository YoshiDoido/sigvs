package com.fatec.sigvs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SigvsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigvsApplication.class, args);
		System.out.println("Vai começar a aplicação...");
	}

}
