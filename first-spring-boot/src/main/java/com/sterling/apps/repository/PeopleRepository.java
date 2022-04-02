package com.sterling.apps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sterling.apps.model.Person;

public interface PeopleRepository extends JpaRepository<Person, Long> {
   public Person findBySno(int sno);
}
