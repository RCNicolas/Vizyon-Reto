package com.example.vizyon.services;

import com.example.vizyon.repositories.InsumoProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsumoProveedorService {

    @Autowired
    InsumoProveedorRepository insumoProveedorRepository;
}
