package com.example.vizyon.services;

import com.example.vizyon.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargosService {

    @Autowired
    CargoRepository cargosRepository;
}
