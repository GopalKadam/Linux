package com.main.profinch.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.profinch.Person;

@Repository
public interface PersonRepo extends CrudRepository<Person, Integer> {

	

	

}
