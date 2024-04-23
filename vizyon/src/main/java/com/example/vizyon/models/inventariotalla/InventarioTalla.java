package com.example.vizyon.models.inventariotalla;

import com.example.vizyon.models.Inventario;
import com.example.vizyon.models.Talla;
import jakarta.persistence.*;

@Entity
@Table(name = "inventario_talla")
public class InventarioTalla {

    @EmbeddedId
    private InventarioTallaId id;

    @ManyToOne
    @MapsId("idInventario")
    @JoinColumn(name = "id_inv_fk")
    private Inventario inventario;

    @ManyToOne
    @MapsId("idTalla")
    @JoinColumn(name = "id_talla_fk")
    private Talla talla;

    public InventarioTallaId getId() {
        return id;
    }

    public void setId(InventarioTallaId id) {
        this.id = id;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }
}
