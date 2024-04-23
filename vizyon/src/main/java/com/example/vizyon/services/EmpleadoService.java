package com.example.vizyon.services;

import com.example.vizyon.models.Empleado;
import com.example.vizyon.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;


    public List<Empleado> finAllEmpleados(){
        return empleadoRepository.findAll();
    }

    //2
    public List<Empleado> findAllEmpleadosWithCargoAndMunicipio(){
        return empleadoRepository.findAllEmpleadosWithCargoAndMunicipio();
    };

    //12

//    public List<Object[]> findEmpleadosAndAniosEmpleo()
//    {
//        return empleadoRepository.findEmpleadosAndAniosEmpleo();
//    };

    //15
    public List<Object[]> findEmpleadosAndContacto(){
        return empleadoRepository.findEmpleadosAndContacto();
    };

    //23
//    public List<Object[]> findEmpleadosAndCargoOrderByFechaIngresoDesc(){
//        return empleadoRepository.findEmpleadosAndCargoOrderByFechaIngresoDesc();
//    };
}
