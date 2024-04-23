package com.example.vizyon.services;

import com.example.vizyon.repositories.CargosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargosService {

    @Autowired
    CargosRepository cargosRepository;
}
