package com.example.vizyon.models;

import jakarta.persistence.*;

@Entity
@Table(name = "talla")
public class Talla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idTalla;

    public Talla() {
    }

    @Column(name = "descripcion")
    private String descripcion;

    public Talla(int idTalla, String descripcion) {
        this.idTalla = idTalla;
        this.descripcion = descripcion;
    }
}
