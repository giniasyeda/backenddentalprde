package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories
public class BackEndDentalApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BackEndDentalApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRespository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
