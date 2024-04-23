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
}
