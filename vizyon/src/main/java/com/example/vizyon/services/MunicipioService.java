package com.example.vizyon.services;

import com.example.vizyon.repositories.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MunicipioService {
    @Autowired
    MunicipioRepository municipioRepository;
}
