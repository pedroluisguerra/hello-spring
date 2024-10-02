package com.keepcoding.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keepcoding.spring.model.Person;
import com.keepcoding.spring.service.PersonService;
import com.keepcoding.spring.serviceimpl.PersonServiceImpl;

@RestController
// Anotación para definir cómo controlador a HelloController
public class HelloController {
	
	@Autowired
	PersonService service;
	
	@GetMapping("/person")
	// Definir la ruta para un método http de tipo get
	public List<Person> index() {
						
		return service.listingPerson();
	}
	
	@GetMapping("/newperson")
	public String addPerson() {
		service.insertPerson();
		return "Persona registrada correctamente.";
	}
}
