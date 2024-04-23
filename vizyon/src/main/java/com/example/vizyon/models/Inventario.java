package com.example.vizyon.models;

import jakarta.persistence.*;

@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idInventario;

    @Column(name = "cod_inv")
    private String codInv;

    @Column(name = "valor_vta_cop")
    private Double valorVtaCOP;

    @Column(name = "valor_vta_usd")
    private Double valorVtaUSD;

    @ManyToOne
    @JoinColumn(name = "Id_prenda_fk")
    private Prenda prenda;

    public Inventario() {
    }

    public Inventario(int idInventario, String codInv, Double valorVtaCOP, Double valorVtaUSD, Prenda prenda) {
        this.idInventario = idInventario;
        this.codInv = codInv;
        this.valorVtaCOP = valorVtaCOP;
        this.valorVtaUSD = valorVtaUSD;
        this.prenda = prenda;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getCodInv() {
        return codInv;
    }

    public void setCodInv(String codInv) {
        this.codInv = codInv;
    }

    public Double getValorVtaCOP() {
        return valorVtaCOP;
    }

    public void setValorVtaCOP(Double valorVtaCOP) {
        this.valorVtaCOP = valorVtaCOP;
    }

    public Double getValorVtaUSD() {
        return valorVtaUSD;
    }

    public void setValorVtaUSD(Double valorVtaUSD) {
        this.valorVtaUSD = valorVtaUSD;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }
}
