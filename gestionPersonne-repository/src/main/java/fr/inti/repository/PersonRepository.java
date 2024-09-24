package fr.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.inti.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
