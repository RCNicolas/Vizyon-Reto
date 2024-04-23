package com.example.vizyon.services;

import com.example.vizyon.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;
}
