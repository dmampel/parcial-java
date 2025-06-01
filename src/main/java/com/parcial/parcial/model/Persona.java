package com.parcial.parcial.model;

import jakarta.persistence.*;

@MappedSuperclass
public class Persona {
    @Id
    private int dni;
    private String nombre;

    public Persona(){}

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
