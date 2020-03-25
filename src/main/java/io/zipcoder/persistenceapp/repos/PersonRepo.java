package io.zipcoder.persistenceapp.repos;

import io.zipcoder.persistenceapp.entities.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepo extends CrudRepository<Person, Long> {
    Iterable<Person> findAllByFirstname(String firstname);

    Iterable<Person> findAllByLastname(String lastname);

    Iterable<Person> findAllByBirthdate(String birthdate);

    Iterable<Person> findAllByMobile(String mobile);


}
