package com.avicolaBarichara.services;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.avicolaBarichara.domain.Person;
import com.avicolaBarichara.repository.PersonRepository;

@Service
public class PersonService {
	
	public final PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	 @Transactional(readOnly = true)
	    public List<Person> getPersons(){  
	        return (List<Person>) personRepository.findAll();
	    }
	 
	
	    public void createPerson(Person person){  
	        personRepository.save(person);
	    }

		public Person findPersonById(Integer id) {
			personRepository.findById(id).get();
			return null;
		}

		public void deletePerson(Person personTemp) {
			personRepository.delete(personTemp);	
		}
	    
}
