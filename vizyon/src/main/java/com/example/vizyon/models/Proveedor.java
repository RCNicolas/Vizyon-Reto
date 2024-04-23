package com.example.vizyon.models;

import jakarta.persistence.*;

@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idProveedor;

    public Proveedor() {
    }

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nit_proveedor")
    private String nitProveedor;

    @ManyToOne
    @JoinColumn(name = "id_tipo_persona")
    private TipoPersona tipoPersona;

    @ManyToOne
    @JoinColumn(name = "id_municipio_fk")
    private Municipio municipio;

    public Proveedor(int idProveedor, String nombre, String nitProveedor, TipoPersona tipoPersona, Municipio municipio) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.nitProveedor = nitProveedor;
        this.tipoPersona = tipoPersona;
        this.municipio = municipio;
    }
}
