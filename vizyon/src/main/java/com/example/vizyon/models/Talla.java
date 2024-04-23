package com.example.vizyon.models;

import jakarta.persistence.*;

@Entity
@Table(name = "talla")
public class Talla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idTalla;

    @Column(name = "descripcion")
    private String descripcion;
}
