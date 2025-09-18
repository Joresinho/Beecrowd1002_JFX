package com.mycompany.java;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class SecondaryController {
    
    @FXML
    private Label lblResultado;

    @FXML
    private void switchToPrimary() throws IOException{
        App.setRoot("primary");
    }
    @FXML
    public void mostrarResultado(double area) throws IOException {
        lblResultado.setText(String.format("A=%.4f", area));
    }
}