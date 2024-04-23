package com.example.vizyon.repositories;

import com.example.vizyon.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {

    @Query("SELECT v FROM Venta v WHERE MONTH(v.fecha) = 7 AND YEAR(v.fecha) = 2023")
    List<Venta> findAllVentasInJuly2023();

    @Query("SELECT v FROM Venta v JOIN FETCH v.cliente JOIN FETCH v.formaPago")
    List<Venta> findAllVentasWithClienteAndFormaPago();

    @Query("SELECT v.empleado.nombre, COUNT(v) FROM Venta v GROUP BY v.empleado")
    List<Object[]> countVentasByEmpleado();

//    @Query("SELECT v.cliente.nombre, COUNT(d) FROM Venta v JOIN v.detalle_Venta d WHERE v.fecha = ?1 GROUP BY v.cliente.nombre")
//    List<Object[]> findClientesAndCantidadArticulosByFecha(Date fecha);

//
//    @Query("SELECT v.fecha, v.cliente.nombre, v.formaPago.descripcion FROM Venta v WHERE v.fecha BETWEEN :fechaInicio AND :fechaFin")
//    List<Object[]> findVentasByRangoFechas(@Param("fechaInicio") LocalDate fechaInicio, @Param("fechaFin") LocalDate fechaFin);
//
//    @Query("SELECT v.cliente.nombre, SUM(d.cantidad * d.valorUnit) FROM Venta v JOIN v.detalle_Venta d GROUP BY v.cliente.nombre")
//    List<Object[]> findClientesAndTotalGastado();

}
