package com.sidorin.hibernate_demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sidorin.hibernate_demo.domain.Post;
import com.sidorin.hibernate_demo.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	
	public List<Post> getAllPosts() {
		return (List<Post>) postRepository.findAll();
	}
	
	public Optional<Post> getPostById(Long id) {
		return postRepository.findById(id);
	}

	public void addPost(Post post) {
		postRepository.save(post);
		
	}

	public List<Post> getPostByUsers(Long id) {
		return postRepository.findByUserId(id);
	}

	public void updatePost(Post post) {
		postRepository.save(post);
		
	}

	public void deletePost(Long id) {
		postRepository.deleteById(id);
		
	}
	
	


}
