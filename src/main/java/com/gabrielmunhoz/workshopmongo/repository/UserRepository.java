package com.gabrielmunhoz.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gabrielmunhoz.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
