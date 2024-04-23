package com.example.vizyon.services;

import com.example.vizyon.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;
}
