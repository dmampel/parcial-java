package com.parcial.parcial.controllers;

import com.parcial.parcial.model.Autor;
import com.parcial.parcial.model.AutorManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.util.Callback;

import javax.swing.*;

public class MainViewController {

    @FXML private TextField dniTextField;

    @FXML private TextField nombreTextField;

    @FXML private TextField pseudonimoTextField;

    @FXML private ListView<Autor> autoresListView;

    private AutorManager autorManager;

    @FXML
    public void initialize() {
        autorManager = new AutorManager();
        autoresListView.setItems(autorManager.getAutores());

        autoresListView.setCellFactory(new Callback<ListView<Autor>, ListCell<Autor>>() {
            @Override
            public ListCell<Autor> call(ListView<Autor> param) {
                return new ListCell<Autor>() {
                    @Override
                    protected void updateItem(Autor autor, boolean empty) {
                        super.updateItem(autor, empty);
                        if (empty || autor == null) {
                            setText(null);
                        } else {
                            setText(autor.getNombre() + " (" + autor.getPseudonimo() + ") - DNI: " + autor.getDni());
                        }
                    }
                };
            }
        });
    }

    @FXML
    private void agregarAutor(ActionEvent event) {
        try{
            int dni = Integer.parseInt(dniTextField.getText());
            String nombre = nombreTextField.getText();
            String pseudonimo = pseudonimoTextField.getText();

            if(nombre.isEmpty() || pseudonimo.isEmpty() ){
                System.out.println("Error: Nombre y Pseudonimo no pueden estar vacios.");
                return;
            }
            Autor autor = new Autor(dni, nombre, pseudonimo);
            autorManager.addAutor(autor);

            dniTextField.clear();
            nombreTextField.clear();
            pseudonimoTextField.clear();


        }catch (NumberFormatException e){
            System.out.println("Error: El DNI debe ser un número válido.");
            System.out.println(e.getMessage());
        }


    }

}
