package com.sidorin.hibernate_demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sidorin.hibernate_demo.domain.Post;


@Repository
public interface PostRepository extends CrudRepository<Post, Long>{
	
	
	List<Post> findByUserId(Long id);

}
