package com.example.moneywisdom;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TradeController {
    @FXML
    public void Expenses(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("expenses.fxml"));
            Parent novoLayout = loader.load();

            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

            Stage novoStage = new Stage();
            novoStage.setScene(new Scene(novoLayout));
            novoStage.show();

            currentStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    public void Dashboard(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));
            Parent novoLayout = loader.load();

            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

            Stage novoStage = new Stage();
            novoStage.setScene(new Scene(novoLayout));
            novoStage.show();

            currentStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
