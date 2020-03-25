package io.zipcoder.persistenceapp.service;

import io.zipcoder.persistenceapp.entities.Person;
import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface PersonService {
    ResponseEntity<Iterable<Person>> getAllPeople();

    ResponseEntity<Person> addPerson(Person person);

    ResponseEntity<Person> updatePerson(Person person);

    ResponseEntity removePerson(Long personId);

    ResponseEntity removeAll(Collection<Person> people);

    ResponseEntity<Iterable<Person>> findByFirstName(String firstname);

    ResponseEntity<Iterable<Person>> findByLastName(String lastname);

    ResponseEntity<Iterable<Person>> findByBirthday(String birthday);

    ResponseEntity<Iterable<Person>> reverseLookup(String mobile);

    ResponseEntity<Person> findById(Long id);

    ResponseEntity<Map<String, List<Person>>> getDirectorybySurname(String surname);

    ResponseEntity<Map<String, Integer>> getFirstNameStats();
}
