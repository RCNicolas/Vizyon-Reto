package com.example.vizyon.controllers;

import com.example.vizyon.models.Venta;
import com.example.vizyon.services.VentaService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@RestController
@CrossOrigin("*")
@PreAuthorize("hasRole('ADMIN')")
@SecurityRequirement(name = "bearerAuth")
@RequestMapping("/ventas")
public class VentaController {
    @Autowired
    VentaService ventaService;


    @GetMapping()
    public List<Venta> finAllVentas(){
        return  ventaService.finAllVentas();
    }


    @GetMapping("/en-julio-2023")
    public List<Venta> findAllVentasInJuly2023(){
        return ventaService.findAllVentasInJuly2023();
    }
    @GetMapping("/clientes-formas-pago")
    public List<Venta> findAllVentasWithClienteAndFormaPago() {
        return ventaService.findAllVentasWithClienteAndFormaPago();
    }

    @GetMapping("/ventas-por-empleado")
    public List<Object[]> countVentasByEmpleado() {
        return ventaService.countVentasByEmpleado();
    }

//    @GetMapping("/clientes-cantidad-de-articulos-por-fecha/{fecha}")
//    public List<Object[]> findClientesAndCantidadArticulosByFecha(@PathVariable Date fecha) {
//        return ventaService.findClientesAndCantidadArticulosByFecha(fecha);
//    }
//
//    @GetMapping("/por-rango-de-fecha/{fechaInicio}/{fehcaFin}")
//    public List<Object[]> findVentasByRangoFechas(@PathVariable LocalDate fechaInicio,@PathVariable LocalDate fechaFin) {
//        return ventaService.findVentasByRangoFechas(fechaInicio, fechaFin);
//    }
}
