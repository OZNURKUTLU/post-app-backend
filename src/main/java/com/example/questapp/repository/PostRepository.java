package com.example.questapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.questapp.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

	List<Post> findByUserId(Long userId);
	
	@Query(value = "select id from post where user_id = :userId order by create_date desc limit 5",
					nativeQuery = true)
	List<Long> findTopByUserId(Long userId);
}
