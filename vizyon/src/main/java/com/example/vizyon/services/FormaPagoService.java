package com.example.vizyon.services;

import com.example.vizyon.repositories.FormaPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormaPagoService {

    @Autowired
    FormaPagoRepository formaPagoRepository;
}
