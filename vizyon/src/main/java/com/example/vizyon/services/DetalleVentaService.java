package com.example.vizyon.services;

import com.example.vizyon.repositories.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleVentaService {
    @Autowired
    DetalleVentaRepository detalleVentaRepository;
}
