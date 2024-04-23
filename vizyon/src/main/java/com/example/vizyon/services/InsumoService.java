package com.example.vizyon.services;

import com.example.vizyon.repositories.InsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsumoService {
    @Autowired
    InsumoRepository insumoRepository;
}
