package com.example.vizyon.controllers;

import com.example.vizyon.models.Inventario;
import com.example.vizyon.services.InventarioService;
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
@RequestMapping("/inventarios")
public class InventarioController {
    @Autowired
    InventarioService inventarioService;

    @GetMapping()
    public List<Inventario> finAllInventario(){
        return inventarioService.finAllInventario();
    }
//    @GetMapping("producto-talla-y-color")
//    public List<Inventario> findAllProductosInventarioWithTallaAndColor(){
//        return inventarioService.findAllProductosInventarioWithTallaAndColor();
//    };

}
