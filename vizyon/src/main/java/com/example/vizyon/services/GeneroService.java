package com.example.vizyon.services;

import com.example.vizyon.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {

    @Autowired
    GeneroRepository generoRepository;
}
