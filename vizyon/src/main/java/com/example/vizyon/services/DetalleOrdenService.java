package com.example.vizyon.services;

import com.example.vizyon.models.DetalleOrden;
import com.example.vizyon.repositories.DetalleOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleOrdenService {
    @Autowired
    DetalleOrdenRepository detalleOrdenRepository;

    public List<DetalleOrden> finAllDetalleOrden(){
        return detalleOrdenRepository.findAll();
    }

    public List<DetalleOrden> findAllDetalleOrdenWithEmpleadoAndCliente(){
        return detalleOrdenRepository.findAllDetalleOrdenWithEmpleadoAndCliente();
    };

}
