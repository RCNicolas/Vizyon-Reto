package com.example.vizyon.services;

import com.example.vizyon.repositories.InsumoPrendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsumoPrendasService {

    @Autowired
    InsumoPrendasRepository insumoPrendasRepository;
}
