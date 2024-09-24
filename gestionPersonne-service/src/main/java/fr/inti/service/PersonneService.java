package fr.inti.service;

import java.util.List;

import fr.inti.entities.Person;

public interface PersonneService {
	
	 public List<Person> getAllPersons();
	    
	 public Person savePerson(Person person);

}
