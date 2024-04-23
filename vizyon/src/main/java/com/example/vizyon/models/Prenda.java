package com.example.vizyon.models;

import jakarta.persistence.*;

@Entity
@Table(name = "prenda")
public class Prenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idPrenda;

    @Column(name = "nombre")
    private String nombre;

    public Prenda(int idPrenda, String nombre, Double valorUnitCOP, Double valorUnitUSD, String codigo, Estado estado, TipoProteccion tipoProteccion, Genero genero) {
        this.idPrenda = idPrenda;
        this.nombre = nombre;
        this.valorUnitCOP = valorUnitCOP;
        this.valorUnitUSD = valorUnitUSD;
        this.codigo = codigo;
        this.estado = estado;
        this.tipoProteccion = tipoProteccion;
        this.genero = genero;
    }

    public Prenda() {
    }

    @Column(name = "valor_unit_cop")
    private Double valorUnitCOP;

    @Column(name = "valor_unit_usd")
    private Double valorUnitUSD;

    @Column(name = "codigo")
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "id_estado_fk")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "id_tipo_proteccion")
    private TipoProteccion tipoProteccion;

    @ManyToOne
    @JoinColumn(name = "id_genero_fk")
    private Genero genero;

    public int getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(int idPrenda) {
        this.idPrenda = idPrenda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValorUnitCOP() {
        return valorUnitCOP;
    }

    public void setValorUnitCOP(Double valorUnitCOP) {
        this.valorUnitCOP = valorUnitCOP;
    }

    public Double getValorUnitUSD() {
        return valorUnitUSD;
    }

    public void setValorUnitUSD(Double valorUnitUSD) {
        this.valorUnitUSD = valorUnitUSD;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoProteccion getTipoProteccion() {
        return tipoProteccion;
    }

    public void setTipoProteccion(TipoProteccion tipoProteccion) {
        this.tipoProteccion = tipoProteccion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
