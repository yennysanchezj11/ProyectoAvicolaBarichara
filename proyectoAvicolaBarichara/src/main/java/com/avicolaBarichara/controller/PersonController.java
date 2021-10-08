package com.avicolaBarichara.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.avicolaBarichara.domain.Person;
import com.avicolaBarichara.repository.PersonRepository;
import com.avicolaBarichara.services.PersonService;


@Controller
public class PersonController {
	
	private final PersonService persService;
	
	public PersonController(PersonService persService) {
		this.persService = persService;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("Persona", new Person());
		model.addAttribute("personas", persService.getPersons());
		return "index";
	}
	
	@PostMapping("/")
	public String CreatePerson(Model model,Person person) {
		persService.createPerson(person);
		model.addAttribute("persona", new Person());
		model.addAttribute("personas", persService.getPersons());
		return "index";
	}
	
	
	@GetMapping("/editPerson/{id_person}")
	public String editPerson(Model model,@PathVariable(name="id_person") Integer id) {
		Person personTemp= persService.findPersonById(id);
		model.addAttribute("person",personTemp);
		model.addAttribute("personas", persService.getPersons());
		return "index";
	}
	
	@GetMapping("/deletePerson/{id_person}")
	public String DeletePerson(Model model,@PathVariable(name="id_person") Integer id) {
		Person personTemp= persService.findPersonById(id);
		persService.deletePerson(personTemp);
		model.addAttribute("person",personTemp);
		model.addAttribute("persona", new Person());
		model.addAttribute("personas", persService.getPersons());
		return "index";
	}

}
