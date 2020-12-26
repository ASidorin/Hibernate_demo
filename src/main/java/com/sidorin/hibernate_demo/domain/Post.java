package com.sidorin.hibernate_demo.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Post {
	
	
	@Id
	private Long id;
	private LocalDateTime postData;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="userid", insertable=false, updatable=false)
	private Users user;
	
	private String details;
	
	
	private Long userid;
	
	
	public Post() {
		super();
	}
	public Post(Long id, LocalDateTime postData, Users user, String details) {
		super();
		this.id = id;
		this.postData = postData;
		this.user = user;
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
	
	@JsonBackReference
	public Users getUsers() {
		return user;
	}
	public void setUsers(Users user) {
		this.user = user;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	

}
