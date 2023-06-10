package com.projectzero.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageAppApplication implements Runnable  {

	public static void main(String[] args) {
		SpringApplication.run(MessageAppApplication.class, args);
		
		
	}

	@Override
	public void run() {
		System.out.println("Programme Strated");
		
	}

}
