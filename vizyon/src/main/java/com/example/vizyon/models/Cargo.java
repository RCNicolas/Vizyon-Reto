package com.example.vizyon.models;


import jakarta.persistence.*;

@Entity
    @Table(name = "cargo")
    public class Cargo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int idCargo;

        @Column(name = "descripcion")
        private String descripcion;

        @Column(name = "sueldo_base")
        private double sueldoBase;

        public Cargo() {
        }

        public Cargo(int idCargo, String descripcion, double sueldoBase) {
            this.idCargo = idCargo;
            this.descripcion = descripcion;
            this.sueldoBase = sueldoBase;
        }

        public int getIdCargo() {
            return idCargo;
        }

        public void setIdCargo(int idCargo) {
            this.idCargo = idCargo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public double getSueldoBase() {
            return sueldoBase;
        }

        public void setSueldoBase(double sueldoBase) {
            this.sueldoBase = sueldoBase;
        }
    }
