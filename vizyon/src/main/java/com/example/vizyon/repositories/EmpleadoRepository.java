package com.example.vizyon.repositories;

import com.example.vizyon.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

    //2
    @Query("SELECT e FROM Empleado e JOIN FETCH e.cargo JOIN FETCH e.municipio")
    List<Empleado> findAllEmpleadosWithCargoAndMunicipio();

    //12
//    @Query("SELECT e, YEAR(CURRENT_DATE) - YEAR(e.fechaIngreso) FROM Empleado e")
//    List<Object[]> findEmpleadosAndAniosEmpleo();

    //15
    @Query("SELECT e.nombre, e.cargo.descripcion, e.municipio.nombre FROM Empleado e")
    List<Object[]> findEmpleadosAndContacto();

    //23
//    @Query("SELECT e.nombre, e.cargo.descripcion, e.fechaIngreso FROM Empleado e ORDER BY e.fechaIngreso DESC")
//    List<Object[]> findEmpleadosAndCargoOrderByFechaIngresoDesc();

}
