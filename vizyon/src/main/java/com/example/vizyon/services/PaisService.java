package com.example.vizyon.services;

import com.example.vizyon.repositories.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService {
    @Autowired
    PaisRepository paisRepository;
}
