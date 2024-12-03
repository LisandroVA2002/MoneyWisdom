package com.example.moneywisdom;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardController {
    @FXML
    private ComboBox<String> timePeriodComboBox;

    @FXML
    public void Combobox() {

        timePeriodComboBox.getItems().addAll("Este mês", "Últimos 3 meses", "Últimos 6 meses");
        timePeriodComboBox.setValue("Este mês");
    }
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
    public void Trade(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Trade.fxml"));
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

