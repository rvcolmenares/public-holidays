package com.publicholidays;

import client.nagerdate.NagerDateClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Autowired
	private NagerDateClient nagerDateClient;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
