package com.mycompany.java;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

import javafx.scene.Parent;
public class PrimaryController {

    @FXML
    private javafx.scene.control.TextField N;
    
    @FXML
    private void switchToSecondary(ActionEvent event) throws IOException {
       // App.setRoot("secondary");
       try {
           double raio = Double.parseDouble(N.getText());
           double area = 3.14159*raio*raio;
           
           //Carregar o FXML da secondary
           FXMLLoader loader = new FXMLLoader(getClass().getResource("secondary.fxml"));
           Parent root = loader.load();
           
           //Pegar o controller da secundary
           SecondaryController controller = loader.getController();
           controller.mostrarResultado(area);
           
           //Trocar a cena
           Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
           stage.setScene(new Scene(root));
           stage.show();
       }  catch (NumberFormatException e) {
           System.out.println("Digite um número válido!");
       }
    }
}
