package com.example.vizyon.models;

import jakarta.persistence.*;

@Entity
@Table(name = "forma_pago")
public class FormaPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idFormaPago;

    @Column(name = "descripcion")
    private String decripcion;

    public FormaPago() {
    }

    public FormaPago(int idFormaPago, String decripcion) {
        this.idFormaPago = idFormaPago;
        this.decripcion = decripcion;
    }

    public int getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }
}
