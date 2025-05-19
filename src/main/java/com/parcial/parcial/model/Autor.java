package com.parcial.parcial.model;

public class Autor extends Persona {
    public String pseudonimo;

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
