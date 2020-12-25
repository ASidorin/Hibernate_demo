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
	private UsersRepository userPerository;

	public List<Users> getAllUsers() {
		return (List<Users>) userPerository.findAll();
	}

	public Optional<Users> getUserById(Long id) {
		return userPerository.findById(id);
	}

}
