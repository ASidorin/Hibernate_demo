package com.sidorin.hibernate_demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/posts/users/{id}/posts")
	public List<Post> getPostsByUsers(@PathVariable Long id){
		return postService.getPostByUsers(id);
	}
	
	@PostMapping("/posts?addNew")
	public void AddPost(@RequestBody Post post) {
		postService.addPost(post);
	}
	
	@PutMapping("/posts/{id}/update")
	public void updatePost(@RequestBody Post post) {
		postService.updatePost(post);
	}

	@DeleteMapping("/posts/{id}/delete")
	public void deletePost(@PathVariable Long id) {
		postService.deletePost(id);
	}
	
	
	

}
