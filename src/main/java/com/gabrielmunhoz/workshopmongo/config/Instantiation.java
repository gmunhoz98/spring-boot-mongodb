package com.gabrielmunhoz.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.gabrielmunhoz.workshopmongo.domain.Post;
import com.gabrielmunhoz.workshopmongo.domain.User;
import com.gabrielmunhoz.workshopmongo.repository.PostRepository;
import com.gabrielmunhoz.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userReposiroty;


	@Autowired
	private PostRepository postReposiroty;

	@Override
	public void run(String... arg0) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		userReposiroty.deleteAll();
		postReposiroty.deleteAll();

		User user1 = new User(null, "Usuario 1", "user1@gmail.com");
		User user2 = new User(null, "Usuario 2", "user2@gmail.com");
		User user3 = new User(null, "Usuario 3", "user3@gmail.com");

		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", user1);
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", user1);

		userReposiroty.saveAll(Arrays.asList(user1, user2, user3));
		postReposiroty.saveAll(Arrays.asList(post1, post2));
	}

}
