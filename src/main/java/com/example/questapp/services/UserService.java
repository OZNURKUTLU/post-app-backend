package com.example.questapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import com.example.questapp.entities.User;
import com.example.questapp.repository.CommentRepository;
import com.example.questapp.repository.LikeRepository;
import com.example.questapp.repository.PostRepository;
import com.example.questapp.repository.UserRepository;

@Service
public class UserService {
	
	UserRepository userRepository;
	LikeRepository likeRepository;
	CommentRepository commentRepository;
	PostRepository postRepository;
	
	public UserService(UserRepository userRepository, LikeRepository likeRepository, 
			CommentRepository commentRepository, PostRepository postRepository) {
		this.userRepository = userRepository;
		this.likeRepository = likeRepository;
		this.commentRepository = commentRepository;
		this.postRepository = postRepository;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User saveOneUser(User newUser) {
		return userRepository.save(newUser);
	}

	public User getOneUserById(Long userId) {
		return userRepository.findById(userId).orElse(null);
	}
	
	public User getOneUserByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

	public User updateOneUser(Long userId, User newUser) {
		Optional<User> user = userRepository.findById(userId);
		if(user.isPresent()) {
			User foundUser = user.get();
			if (newUser.getUserName() != null) {
	            foundUser.setUserName(newUser.getUserName());
	        }
	        if (newUser.getPassword() != null) {
	            foundUser.setPassword(newUser.getPassword());
	        }
	        if (newUser.getAvatar() != 0) {
	            foundUser.setAvatar(newUser.getAvatar());
	        }
			userRepository.save(foundUser);
			return foundUser;
		}else
			return null;
	}

	public void deleteById(Long userId) {
		try {
			userRepository.deleteById(userId);
			}catch(EmptyResultDataAccessException e) { 
				System.out.println("User "+userId+" doesn't exist"); 
			}
		
	}

	public List<Object> getUserActivity(Long userId) {
		List<Long> postIds = postRepository.findTopByUserId(userId);
		if(postIds.isEmpty())
			return null;
		List<Object> comments = commentRepository.findUserCommentsByPostId(postIds);
		List<Object> likes = likeRepository.findUserLikesByPostId(postIds);
		List<Object> result = new ArrayList<>();
		result.addAll(comments);
		result.addAll(likes);
		return result;
	}

}
