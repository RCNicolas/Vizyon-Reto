package com.example.vizyon.models.insumoproveedor;

import com.example.vizyon.models.Insumo;
import com.example.vizyon.models.Proveedor;
import jakarta.persistence.*;

@Entity
@Table(name = "insumo_proveedor")
public class InsumoProveedor {

    @EmbeddedId
    private InsumoProveedorId id;

    @ManyToOne
    @MapsId("idInsumo")
    @JoinColumn(name = "id_insumo_fk")
    private Insumo insumo;

    @ManyToOne
    @MapsId("idProveedor")
    @JoinColumn(name = "id_proveedor_fk")
    private Proveedor proveedor;

    public InsumoProveedorId getId() {
        return id;
    }

    public void setId(InsumoProveedorId id) {
        this.id = id;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
