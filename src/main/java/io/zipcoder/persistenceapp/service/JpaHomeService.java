package io.zipcoder.persistenceapp.service;

import io.zipcoder.persistenceapp.repos.HomeRepo;
import org.springframework.stereotype.Service;

@Service
public class JpaHomeService implements HomeService {

    private HomeRepo homeRepo;

    public JpaHomeService(HomeRepo homeRepo) {
        this.homeRepo = homeRepo;
    }
}