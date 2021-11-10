package com.example.calculatorfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        Vista vista = new Vista();
        Scene scene = new Scene(vista,400,400);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        //stage.setResizable(false);
        stage.initStyle(StageStyle.DECORATED);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}