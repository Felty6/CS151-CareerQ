package com.example.careerq.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.careerq.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	Optional<User> findByEmail(String email);
}
