package com.gabrielmunhoz.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielmunhoz.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User noelle = new User("1", "Noelle Silva", "noelle@gmail.com");
		User nozel = new User("2", "Nozel Silva", "nozel@gmail.com");
		List<User> list = new ArrayList<>();

		list.addAll(Arrays.asList(noelle, nozel));
		return ResponseEntity.ok().body(list);
	}
}
