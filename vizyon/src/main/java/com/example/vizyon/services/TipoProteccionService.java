package com.example.vizyon.services;

import com.example.vizyon.repositories.TipoProteccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoProteccionService {
    @Autowired
    TipoProteccionRepository tipoProteccionRepository;
}
