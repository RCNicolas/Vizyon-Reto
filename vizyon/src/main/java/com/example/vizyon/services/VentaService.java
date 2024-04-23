package com.example.vizyon.services;

import com.example.vizyon.models.Venta;
import com.example.vizyon.repositories.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class VentaService {

    @Autowired
    VentaRepository ventaRepository;

    public List<Venta> finAllVentas (){
        return ventaRepository.findAll();
    }
    public List<Venta> findAllVentasInJuly2023() {
        return ventaRepository.findAllVentasInJuly2023();
    }

    public List<Venta> findAllVentasWithClienteAndFormaPago() {
        return ventaRepository.findAllVentasWithClienteAndFormaPago();
    }

    public List<Object[]> countVentasByEmpleado() {
        return ventaRepository.countVentasByEmpleado();
    }
//
//    public List<Object[]> findClientesAndCantidadArticulosByFecha(Date fecha) {
//        return ventaRepository.findClientesAndCantidadArticulosByFecha(fecha);
//    }
////
//    public List<Object[]> findVentasByRangoFechas(LocalDate fechaInicio, LocalDate fechaFin) {
//        return ventaRepository.findVentasByRangoFechas(fechaInicio, fechaFin);
//    }


}