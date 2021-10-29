package com.example.BankSysytem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BankSysytemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankSysytemApplication.class, args);
	}

}
