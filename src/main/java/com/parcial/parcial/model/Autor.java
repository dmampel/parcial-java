package com.parcial.parcial.model;

import jakarta.persistence.*;

@Entity
@Table(name = "autores")
public class Autor extends Persona {
    private String pseudonimo;

    public Autor() {}

    public Autor(int dni, String nombre, String pseudonimo) {
        super(dni, nombre);
        this.pseudonimo = pseudonimo;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }
}
