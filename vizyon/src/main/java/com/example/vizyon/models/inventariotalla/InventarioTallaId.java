package com.example.vizyon.models.inventariotalla;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class InventarioTallaId implements Serializable {

    @Column(name = "id_inv_fk")
    private int idInventario;

    @Column(name = "id_talla_fk")
    private int idTalla;

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(int idTalla) {
        this.idTalla = idTalla;
    }
}
