package com.example.vizyon.services;

import com.example.vizyon.repositories.DetalleOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenService {
    @Autowired
    DetalleOrdenRepository detalleOrdenRepository;
}
