package com.example.vizyon.models;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_orden")
public class DetalleOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idDetalleOrden;

    @Column(name = "cantidad_producida")
    private int cantidadProducida;

    @Column(name = "cantidad_producir")
    private int cantidadProducir;

    @ManyToOne
    @JoinColumn(name = "id_orden_fk")
    private Orden orden;

    @ManyToOne
    @JoinColumn(name = "id_prenda_fk")
    private Prenda prenda;

    @ManyToOne
    @JoinColumn(name = "id_color_fk")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "id_estado_fk")
    private Estado estado;


    public int getIdDetalleOrden() {
        return idDetalleOrden;
    }

    public void setIdDetalleOrden(int idDetalleOrden) {
        this.idDetalleOrden = idDetalleOrden;
    }

    public int getCantidadProducida() {
        return cantidadProducida;
    }

    public void setCantidadProducida(int cantidadProducida) {
        this.cantidadProducida = cantidadProducida;
    }

    public int getCantidadProducir() {
        return cantidadProducir;
    }

    public void setCantidadProducir(int cantidadProducir) {
        this.cantidadProducir = cantidadProducir;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
