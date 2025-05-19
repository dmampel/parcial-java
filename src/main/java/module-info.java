module com.parcial.parcial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.parcial.parcial to javafx.fxml;
    exports com.parcial.parcial;
    exports com.parcial.parcial.controllers;
}