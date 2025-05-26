module com.parcial.parcial {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.parcial.parcial to javafx.fxml;
    exports com.parcial.parcial;
    exports com.parcial.parcial.controllers;
    opens com.parcial.parcial.controllers to javafx.fxml;
}