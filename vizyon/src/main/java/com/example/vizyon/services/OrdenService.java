package com.example.vizyon.services;

import com.example.vizyon.repositories.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenService {
    @Autowired
    OrdenRepository ordenRepository;
}
