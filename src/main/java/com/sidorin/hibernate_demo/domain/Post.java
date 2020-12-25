package com.sidorin.hibernate_demo.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	
	@Id
	private Long id;
	private LocalDateTime postData;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users users;
	
	private String details;
	
	
	public Post() {
		super();
	}
	public Post(Long id, LocalDateTime postData, Users users, String details) {
		super();
		this.id = id;
		this.postData = postData;
		this.users = users;
		this.details = details;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getPostData() {
		return postData;
	}
	public void setPostData(LocalDateTime postData) {
		this.postData = postData;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
