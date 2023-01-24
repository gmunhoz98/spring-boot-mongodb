package com.gabrielmunhoz.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.gabrielmunhoz.workshopmongo.domain.User;
import com.gabrielmunhoz.workshopmongo.repository.UserRepository;

@Configuration
public class Instanciation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAll();

		User noelle = new User(null, "Noelle Silva", "noelle@gmail.com");
		User nozel = new User(null, "Nozel Silva", "nozel@gmail.com");
		User solid = new User(null, "Solid Silva", "solid@gmail.com");

		userRepository.saveAll(Arrays.asList(noelle, nozel, solid));

	}

}
