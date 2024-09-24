package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.entities.Person;
import fr.inti.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonneService {
	
	@Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
    
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }
    

}
