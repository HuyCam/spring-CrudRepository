package com.example.springjpa.repository;


import com.example.springjpa.model.User;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@Repository
@RepositoryRestResource(path = "users"
,collectionResourceRel="users"
)
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByFirstName(@Param("firstName") String firstName);
}