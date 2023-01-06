package com.example.springapp.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.jpa.entity.JpaPerson;
import com.example.springapp.jpa.repository.JpaPersonRepository;

@Service
public class PersonService {

    @Autowired
    private JpaPersonRepository jpaPersonRepository;

    public List<JpaPerson> findAll() {
        return jpaPersonRepository.findAll();
    }
}
