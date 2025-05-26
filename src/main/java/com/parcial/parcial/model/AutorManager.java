package com.parcial.parcial.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AutorManager {

    private ObservableList<Autor> autores;

    public AutorManager() {
        autores = FXCollections.observableArrayList();
        autores.add(new Autor(12345678, "Gabriel Garcia Marquez", "Gabo"));
        autores.add(new Autor(87654321, "Julio Cortazar", "Cronopio"));
    }

    public ObservableList<Autor> getAutores() {
        return autores;
    }

    public void addAutor(Autor autor) {
        if(autor != null) {
            autores.add(autor);
        }
    }


}
