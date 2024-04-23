package com.example.vizyon.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_estado")
public class TipoEstado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idTipoEstado;

    @Column(name = "descripcion")
    private String descripcion;

    public TipoEstado() {
    }

    public TipoEstado(int idTipoEstado, String descripcion) {
        this.idTipoEstado = idTipoEstado;
        this.descripcion = descripcion;
    }
}
