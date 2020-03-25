package io.zipcoder.persistenceapp.controller;

import io.zipcoder.persistenceapp.entities.Person;
import io.zipcoder.persistenceapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/people", method = GET)
    public ResponseEntity<Iterable<Person>> getAllPeople() {
        return personService.getAllPeople();
    }

    @RequestMapping(value = "/people", method = POST)
    public ResponseEntity<?> createPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @RequestMapping(value = "/people/{id}", method = PUT)
    public ResponseEntity<?> updatePerson(@RequestBody Person person, @PathVariable Long id) {
        return personService.updatePerson(person);
    }

    @RequestMapping(value = "/people/{id}", method = GET)
    public ResponseEntity<Person> getPerson(@PathVariable Long id) {
        return personService.findById(id);
    }

    @RequestMapping(value = "/people/{id}", method = DELETE)
    public ResponseEntity<?> deletePerson(@PathVariable Long id) {
        return personService.removePerson(id);
    }

    @RequestMapping(value = "/people/reverselookup/{mobile}", method = GET)
    public ResponseEntity<Iterable<Person>> reverseLookup(@PathVariable String mobile) {
        return personService.reverseLookup(mobile);
    }

    @RequestMapping(value = "/people/surname/{lastName}", method = GET)
    public ResponseEntity<Iterable<Person>> surnameLookup(@PathVariable String lastName) {
        return personService.findByLastName(lastName);
    }

    @RequestMapping(value = "/people/firstname/stats", method = GET)
    public ResponseEntity<Map<String, Integer>> firstNameStats() {
        return personService.getFirstNameStats();
    }
}