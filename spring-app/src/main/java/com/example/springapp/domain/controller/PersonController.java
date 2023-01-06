package com.example.springapp.domain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.domain.service.PersonService;
import com.example.springapp.jpa.entity.JpaPerson;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<JpaPerson> findAll() {
        return personService.findAll();
    }
}
