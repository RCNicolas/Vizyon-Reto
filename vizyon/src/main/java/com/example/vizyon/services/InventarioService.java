package com.example.vizyon.services;

import com.example.vizyon.models.Inventario;
import com.example.vizyon.repositories.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    @Autowired
    InventarioRepository inventarioRepository;

    public List<Inventario> finAllInventario(){
        return inventarioRepository.findAll();
    }
//
//    public List<Inventario> findAllProductosInventarioWithTallaAndColor(){
//        return inventarioRepository.findAllProductosInventarioWithTallaAndColor();
//    };


}
