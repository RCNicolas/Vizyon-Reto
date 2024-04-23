package com.example.vizyon.services;

import com.example.vizyon.models.Orden;
import com.example.vizyon.repositories.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenService {
    @Autowired
    OrdenRepository ordenRepository;

    public List<Orden> findAllOrden(){
        return ordenRepository.findAll();
    }


//    public List<Orden> findOrdenesEnProcesoWithClienteAndEmpleado(){
//        return ordenRepository.findOrdenesEnProcesoWithClienteAndEmpleado();
//    };
}
