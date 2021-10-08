package com.avicolaBarichara.repository;

import org.springframework.data.repository.CrudRepository;

import com.avicolaBarichara.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
