package com.example.questapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.questapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String username);

}
