package com.sidorin.hibernate_demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sidorin.hibernate_demo.domain.Location;


@Repository
public interface LocationRepository extends CrudRepository<Location, Long>{

}
