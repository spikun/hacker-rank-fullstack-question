package com.example.springapp.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.jpa.entity.JpaPerson;

@Repository
public interface JpaPersonRepository extends JpaRepository<JpaPerson, Long> {

}
