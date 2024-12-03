package com.example.moneywisdom;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Dashboard.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 1920, 1040);
        scene.getStylesheets().add(HelloApplication.class.getResource("styles.css").toExternalForm());
        stage.setTitle("MoneyWisdom Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
