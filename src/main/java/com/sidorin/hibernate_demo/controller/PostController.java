package com.sidorin.hibernate_demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sidorin.hibernate_demo.domain.Post;
import com.sidorin.hibernate_demo.service.PostService;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;

	@GetMapping("/posts")
	public List<Post> getAllUsers(){
		return postService.getAllPosts();
	}
	
	@GetMapping("/posts/{id}")
	public Optional<Post> getUserBuId(@PathVariable Long id) {
		return postService.getPostById(id);
	}

	
	
	

}
