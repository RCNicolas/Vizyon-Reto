package com.example.vizyon.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idEmpleado;

    @Column(name = "nombre")
    private String nombre;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;

    @ManyToOne
    @JoinColumn(name = "id_cargo_fk")
    private Cargos cargos;

    @ManyToOne
    @JoinColumn(name = "id_municipio_fk")
    private Municipio municipio;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombre, Date fechaIngreso, Cargos cargos, Municipio municipio) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.cargos = cargos;
        this.municipio = municipio;
    }
}
