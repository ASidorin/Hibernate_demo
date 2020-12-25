package com.sidorin.hibernate_demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sidorin.hibernate_demo.domain.Users;


@Repository
public interface UsersRepository extends CrudRepository<Users, Long>{

}
