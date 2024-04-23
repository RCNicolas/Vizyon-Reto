package com.example.vizyon.controllers;

import com.example.vizyon.models.Empleado;
import com.example.vizyon.services.EmpleadoService;
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
@RequestMapping("/empleados")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;



    @GetMapping()
    public List<Empleado> finAllEmpleados(){
        return empleadoService.finAllEmpleados();
    };

    //2
    @GetMapping("/empleados-con-sus-cargos-y-municipios")
    public List<Empleado> findAllEmpleadosWithCargoAndMunicipio(){
        return empleadoService.findAllEmpleadosWithCargoAndMunicipio();
    };

    //12
//    @GetMapping("/empleados-su-duracion-de-empleo")
//    public List<Object[]> findEmpleadosAndAniosEmpleo()
//    {
//        return empleadoService.findEmpleadosAndAniosEmpleo();
//    };

    //15
    @GetMapping("/empleados-con-informacion-contacto")
    public List<Object[]> findEmpleadosAndContacto(){
        return empleadoService.findEmpleadosAndContacto();
    };

    //23
//    @GetMapping("/lista-con-cargos-y-fechas")
//    public List<Object[]> findEmpleadosAndCargoOrderByFechaIngresoDesc(){
//        return empleadoService.findEmpleadosAndCargoOrderByFechaIngresoDesc();
//    };

}
