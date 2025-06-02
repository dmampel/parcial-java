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
    private void eliminarAutor(ActionEvent event) {
        Autor seleccionado = autoresListView.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            autorManager.removeAutor(seleccionado);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Eliminar Autor");
            alert.setHeaderText(null);
            alert.setContentText("Selecciona un autor para eliminar.");
            alert.showAndWait();
        }
    }

    @FXML
    private void agregarAutor(ActionEvent event) {
        try{
            int dni = Integer.parseInt(dniTextField.getText());
            String nombre = nombreTextField.getText();
            String pseudonimo = pseudonimoTextField.getText();

            if (nombre.isEmpty() || pseudonimo.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR); // 1. Especifica el tipo de alerta
                alert.setTitle("Error de Validación"); // Opcional: añade un título a la ventana
                alert.setHeaderText(null); // Opcional: puedes poner un texto de cabecera o dejarlo nulo
                alert.setContentText("El nombre y el seudónimo no pueden estar vacíos."); // 2. Añade el mensaje principal

                alert.showAndWait(); // 3. Muestra la alerta y espera a que el usuario la cierre
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
