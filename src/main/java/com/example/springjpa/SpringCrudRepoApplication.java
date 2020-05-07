package com.example.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springjpa.repository.UserRepository;

@SpringBootApplication
public class SpringCrudRepoApplication {
	
//	@Autowired
//	private UserRepository userData;
//	
//	public void init() {
//		respository.saveAll(Stream.of(
//				new User))
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudRepoApplication.class, args);
	}

}
