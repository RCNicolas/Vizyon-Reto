package com.example.vizyon.services;

import com.example.vizyon.repositories.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {

    @Autowired
    VentaRepository ventaRepository;
}
