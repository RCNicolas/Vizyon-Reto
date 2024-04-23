package com.example.vizyon.models.insumoprendas;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class InsumoPrendasId implements Serializable {

    @Column(name = "id_insumo_fk")
    private int idInsumo;

    @Column(name = "id_prenda_fk")
    private int idPrenda;

}
