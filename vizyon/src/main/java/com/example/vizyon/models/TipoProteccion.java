package com.example.vizyon.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_proteccion")
public class TipoProteccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idTipoProteccion;

    @Column(name = "descripcion")
    private String descripcion;

    public int getIdTipoProteccion() {
        return idTipoProteccion;
    }

    public void setIdTipoProteccion(int idTipoProteccion) {
        this.idTipoProteccion = idTipoProteccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
