package com.example.vizyon.services;

import com.example.vizyon.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {
    @Autowired
    EstadoRepository estadoRepository;
}
