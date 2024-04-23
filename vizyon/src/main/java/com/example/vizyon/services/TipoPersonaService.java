package com.example.vizyon.services;

import com.example.vizyon.repositories.TipoPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoPersonaService {
    @Autowired
    TipoPersonaRepository tipoPersonaRepository;
}
