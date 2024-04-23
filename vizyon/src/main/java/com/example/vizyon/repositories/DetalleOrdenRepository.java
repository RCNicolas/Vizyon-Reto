package com.example.vizyon.repositories;

import com.example.vizyon.models.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {


    @Query("SELECT d FROM DetalleOrden d JOIN FETCH d.orden o JOIN FETCH o.empleado JOIN FETCH o.cliente")
    List<DetalleOrden> findAllDetalleOrdenWithEmpleadoAndCliente();

}
