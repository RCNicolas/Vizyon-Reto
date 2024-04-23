package com.example.vizyon.models.insumoprendas;

import com.example.vizyon.models.Insumo;
import com.example.vizyon.models.Prenda;
import jakarta.persistence.*;

@Entity
@Table(name = "insumo_prendas")
public class InsumoPrendas {

    @EmbeddedId
    private InsumoPrendasId id;

    @ManyToOne
    @MapsId("idInsumo")
    @JoinColumn(name = "id_insumo_fk")
    private Insumo insumo;

    @ManyToOne
    @MapsId("idPrenda")
    @JoinColumn(name = "id_prenda_fk")
    private Prenda prenda;

    @Column(name = "cantidad")
    private int cantidad;

    public InsumoPrendasId getId() {
        return id;
    }

    public void setId(InsumoPrendasId id) {
        this.id = id;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
