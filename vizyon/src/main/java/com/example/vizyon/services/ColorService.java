package com.example.vizyon.services;

import com.example.vizyon.repositories.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorService {
    @Autowired
    ColorRepository colorRepository;
}
