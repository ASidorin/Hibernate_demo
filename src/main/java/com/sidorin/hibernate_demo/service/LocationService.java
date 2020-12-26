package com.sidorin.hibernate_demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sidorin.hibernate_demo.domain.Location;
import com.sidorin.hibernate_demo.repository.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locationRepository;

	public List<Location> findAll() {
		return (List<Location>) locationRepository.findAll();
	}

	public Optional<Location> findById(Long id) {
		return locationRepository.findById(id);
	}
	
	public void AddLocation(Location location) {
		locationRepository.save(location);
		
	}
}
