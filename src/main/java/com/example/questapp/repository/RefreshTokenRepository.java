package com.example.questapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.questapp.entities.RefreshToken;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long>{

	RefreshToken findByUserId(Long userId);
	
}
