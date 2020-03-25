package io.zipcoder.persistenceapp.controller;

import io.zipcoder.persistenceapp.service.JpaHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private JpaHomeService jpaHomeService;

    @Autowired
    public HomeController(JpaHomeService jpaHomeService) {
        this.jpaHomeService = jpaHomeService;
    }
}
