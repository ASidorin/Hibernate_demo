package com.sidorin.hibernate_demo.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Users {
	
	@Id
	private Long id;
	
	private String firstname;
	private String lastname;
	
	@ManyToOne
	@JoinColumn(name="location_id")
	private Location location;

	
	@OneToMany(mappedBy="users")
	private List<Post> posts; 
	
	public Users() {
		super();
	}


	public Users(Long id, String firstname, String lastname, Location location) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}
	
	

}
