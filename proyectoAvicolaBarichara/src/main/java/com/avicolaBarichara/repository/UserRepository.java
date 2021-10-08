package com.avicolaBarichara.repository;

import org.springframework.data.repository.CrudRepository;

import com.avicolaBarichara.domain.User;

public interface UserRepository extends CrudRepository<User, String> {

}
