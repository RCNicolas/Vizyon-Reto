package com.example.vizyon.models;

import jakarta.persistence.*;

@Entity
@Table(name = "municipio")
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idMunicipio;

    @Column(name = "nombre")
    private String nombre;

    public Municipio(int idMunicipio, String nombre, Departamento departamento) {
        this.idMunicipio = idMunicipio;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    public Municipio() {
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
