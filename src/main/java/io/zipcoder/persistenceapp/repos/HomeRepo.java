package io.zipcoder.persistenceapp.repos;

import io.zipcoder.persistenceapp.entities.Home;
import org.springframework.data.repository.CrudRepository;

public interface HomeRepo extends CrudRepository<Home, Long> {
}
