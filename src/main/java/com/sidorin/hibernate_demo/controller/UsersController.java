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

import com.sidorin.hibernate_demo.domain.Location;
import com.sidorin.hibernate_demo.domain.Post;
import com.sidorin.hibernate_demo.domain.Users;
import com.sidorin.hibernate_demo.service.UsersService;

@RestController
public class UsersController {
	
	@Autowired
	private UsersService userService;
	
	
	@GetMapping("/users")
	public List<Users> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public Optional<Users> getUserBuId(@PathVariable Long id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("/users/{id}/posts")
	public List<Post> getPostsByUsers(@PathVariable Long id){
		Optional<Users> users = userService.getUserById(id);
		
		if(users.isPresent()) {
			return users.get().getPosts();
		}
		return null;
	}
	
	@GetMapping("users/location/{id}/users")
	public List<Users> getUsersByLocation(@PathVariable Long id){
		return userService.getUsersByLocation(id);
	}
	
	@PostMapping("/users/addNew")
	public void addUser(@RequestBody Users user) {
		userService.addUser(user);
	}
	
	@PutMapping("/users/{id}/update")
	public void UpdateUser(@RequestBody Users user) {
		userService.updateUser(user);
	}
	
	@DeleteMapping("/users/{id}/delete")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}

}
