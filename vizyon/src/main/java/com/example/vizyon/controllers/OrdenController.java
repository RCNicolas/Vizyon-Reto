package com.example.vizyon.controllers;

import com.example.vizyon.models.Orden;
import com.example.vizyon.services.OrdenService;
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
@RequestMapping("/ordenes")
public class OrdenController {

    @Autowired
    OrdenService ordenService;

    @GetMapping()
    public List<Orden> findAllOrden(){
        return ordenService.findAllOrden();
    }

//    @GetMapping("/proceso-nombres-clientes-y-empleados")
//    public List<Orden> findOrdenesEnProcesoWithClienteAndEmpleado(){
//        return ordenService.findOrdenesEnProcesoWithClienteAndEmpleado();
//    };
}
