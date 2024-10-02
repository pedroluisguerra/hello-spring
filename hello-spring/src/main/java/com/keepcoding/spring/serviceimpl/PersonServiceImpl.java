package com.keepcoding.spring.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.spring.model.Person;
import com.keepcoding.spring.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	Person personInyection;
	List<Person> listPerson = new ArrayList<>();

	@Override
	public List<Person> listingPerson() {
		
		if (listPerson.size() == 1 || listPerson.size() ==0) {
			
			for (int i = 1; i < 4; i++) {		
			
			personInyection.setDni("987654321K"+i);
			personInyection.setName("Pedro"+i);
			personInyection.setSurname("Guerra"+i);
			personInyection.setPhone(652368451+i);
			personInyection.setEmail("pg@gmail.com"+i);
			
			listPerson.add(personInyection);
			}
		}
			
			return listPerson;
	}

	@Override
	public void insertPerson() {
		Person newPerson = new Person("123456789J", "Rafael", "Vertamatti",123456789,"rv@gmail.com");
		
		listPerson.add(newPerson);
	}

}
