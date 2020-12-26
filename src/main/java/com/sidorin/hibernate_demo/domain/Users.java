package com.sidorin.hibernate_demo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Users {
	
	public Long getLocationid() {
		return locationid;
	}


	public void setLocationid(Long locationid) {
		this.locationid = locationid;
	}


	@Id
	private Long id;
	
	private String firstname;
	private String lastname;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="locationid", insertable=false, updatable=false)
	private Location location;
	
	
	private Long locationid;
	
	
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
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
	

	public List<Post> getPosts() {
		return posts;
	}


	public void setPosts(List<Post> posts) {
		this.posts = posts;
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


	@JsonBackReference
	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}
	
	

}
