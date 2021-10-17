package com.database.application.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

import com.database.application.entity.Person;

@Repository
@Transactional
@EntityScan("com.database.application.entity")
public class PersonJPARepository {
	
	@PersistenceContext
	EntityManager entityManager; //JPA
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

}
