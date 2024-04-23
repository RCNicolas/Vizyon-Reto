package com.example.vizyon.services;

import com.example.vizyon.repositories.PrendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrendaService {
    @Autowired
    PrendaRepository prendaRepository;
}
