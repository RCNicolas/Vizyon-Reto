package com.example.vizyon.services;

import com.example.vizyon.repositories.TipoEstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEstadoService {
    @Autowired
    TipoEstadoRepository estadoRepository;
}
