package com.example.vizyon.services;

import com.example.vizyon.repositories.InventarioTallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventarioTallaService {

    @Autowired
    InventarioTallaRepository inventarioTallaRepository;
}
