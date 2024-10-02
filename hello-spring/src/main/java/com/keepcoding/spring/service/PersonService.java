package com.keepcoding.spring.service;

import java.util.List;

import com.keepcoding.spring.model.Person;

public interface PersonService {
	// Definiendo método abstracto llamado listingPerson
	List<Person> listingPerson();
	
	//Definiendo método insertPerson para insertar un registro de person
	void insertPerson();
	
}
