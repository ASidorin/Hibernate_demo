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
import com.sidorin.hibernate_demo.domain.Users;
import com.sidorin.hibernate_demo.service.LocationService;



@RestController
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@GetMapping("/location")
	public List<Location> getAllLocations() {
		return (List<Location>) locationService.findAll();
	}

	@GetMapping("/location/{id}")
	public Optional<Location> getLocationById(@PathVariable Long id) {
		return locationService.findById(id);
	}
	
	@GetMapping("/location/{id}/users")
	public List<Users> getUsersByLocation(@PathVariable Long id){
		Optional<Location> location = locationService.findById(id);
		
		if(location.isPresent()) {
			return location.get().getUsers();
		}
		return null;
	}
	
	@PostMapping("/location/addNew")
	public void AddLocation(@RequestBody Location location) {
		locationService.AddLocation(location);
	}
	
	
	@PutMapping("/location/{id}/update")
	public void UpdateLocation(@RequestBody Location location) {
		locationService.updateLocation(location);
	}
	
	@DeleteMapping("/location/{id}/delete")
	public void deleteLocation(@PathVariable Long id) {
		locationService.deleteLocation(id);
	}
	
	

}
