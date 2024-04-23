package com.example.vizyon.controllers;

import com.example.vizyon.models.DetalleOrden;
import com.example.vizyon.services.DetalleOrdenService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@PreAuthorize("hasRole('ADMIN')")
@SecurityRequirement(name = "bearerAuth")
@RequestMapping("/detalles-de-orden")
public class DetalleOrdenController {
    @Autowired
    DetalleOrdenService detalleOrdenService;

    @GetMapping()
    public List<DetalleOrden> finAllDetalleOrden(){
        return detalleOrdenService.finAllDetalleOrden();
    }

    @GetMapping("orden-nombre-y-clientes")
    public List<DetalleOrden> findAllDetalleOrdenWithEmpleadoAndCliente(){
        return detalleOrdenService.findAllDetalleOrdenWithEmpleadoAndCliente();
    };
}
