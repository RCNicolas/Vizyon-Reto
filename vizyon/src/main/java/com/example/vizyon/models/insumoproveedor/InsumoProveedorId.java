package com.example.vizyon.models.insumoproveedor;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class InsumoProveedorId implements Serializable {

    @Column(name = "id_insumo_fk")
    private int idInsumo;

    @Column(name = "id_proveedor_fk")
    private int idProveedor;

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
}
