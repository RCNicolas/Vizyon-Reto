package com.example.vizyon.models;

import jakarta.persistence.*;

@Entity
@Table(name = "color")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idColor;

    @Column(name = "descripcion")
    private String descripcion;

    public Color(int idColor, String descripcion) {
        this.idColor = idColor;
        this.descripcion = descripcion;
    }

    public Color() {
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
