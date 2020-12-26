package com.sidorin.hibernate_demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sidorin.hibernate_demo.domain.Users;
import com.sidorin.hibernate_demo.repository.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository userRepository;

	public List<Users> getAllUsers() {
		return (List<Users>) userRepository.findAll();
	}

	public Optional<Users> getUserById(Long id) {
		return userRepository.findById(id);
	}

	public List<Users> getUsersByLocation(Long id) {
		return userRepository.findByLocationId(id);
	}
	
	public void addUser(Users user) {
		userRepository.save(user);
	}

}
