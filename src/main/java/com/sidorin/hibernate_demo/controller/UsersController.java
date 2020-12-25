package com.sidorin.hibernate_demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

}
