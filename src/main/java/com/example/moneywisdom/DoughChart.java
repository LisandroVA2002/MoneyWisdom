package com.example.moneywisdom;
import javafx.application.Application;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DoughChart extends Application {

        @Override public void start(Stage stage) {
            stage.setTitle("Imported Fruits");
            stage.setWidth(500);
            stage.setHeight(500);

            ObservableList<PieChart.Data> pieChartData = createData();

            final DoughChart chart = new DoughChart();
            

            Scene scene = new Scene(new StackPane());
            stage.setScene(scene);
            stage.show();
        }

        private ObservableList<PieChart.Data> createData() {
            return FXCollections.observableArrayList(
                    new PieChart.Data("Despesas", 13));
        }

        public static void main(String[] args) {
            launch(args);
        }

    }

