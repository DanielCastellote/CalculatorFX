package com.example.calculatorfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid = new GridPane();
        Label pantalla = new Label("0");
        VBox box = new VBox(pantalla);
        Button n1 = new Button("1");
        Button n2 = new Button("2");
        Button n3 = new Button("3");
        Button n4 = new Button("4");
        Button n5 = new Button("5");
        Button n6 = new Button("6");
        Button n7 = new Button("7");
        Button n8 = new Button("8");
        Button n9 = new Button("9");
        Button n0 = new Button("0");
        Button mas = new Button("+");
        Button menos = new Button("-");
        Button dividir = new Button("/");
        Button multiplicar = new Button("x");
        Button igual = new Button("=");
        Button botonPunto = new Button(".");
        Button reset = new Button("CE");


        box.getChildren().add(grid);
        box.setPrefWidth(80);
        box.setAlignment(Pos.TOP_RIGHT);

        n1.setMinWidth(box.getPrefWidth());
        n2.setMinWidth(box.getPrefWidth());
        n3.setMinWidth(box.getPrefWidth());
        n4.setMinWidth(box.getPrefWidth());
        n5.setMinWidth(box.getPrefWidth());
        n6.setMinWidth(box.getPrefWidth());
        n7.setMinWidth(box.getPrefWidth());
        n8.setMinWidth(box.getPrefWidth());
        n9.setMinWidth(box.getPrefWidth());
        n0.setMinWidth(box.getPrefWidth());
        botonPunto.setMinWidth(box.getPrefWidth());
        reset.setMinWidth(box.getPrefWidth());
        mas.setMinWidth(box.getPrefWidth());
        menos.setMinWidth(box.getPrefWidth());
        dividir.setMinWidth(box.getPrefWidth());
        multiplicar.setMinWidth(box.getPrefWidth());


        grid.add(n1, 0, 0, 1, 1);
        grid.add(n2, 1, 0, 1, 1);
        grid.add(n3, 2, 0, 1, 1);
        grid.add(n4, 0, 1, 1, 1);
        grid.add(n5, 1, 1, 1, 1);
        grid.add(n6, 2, 1, 1, 1);
        grid.add(n7, 0, 2, 1, 1);
        grid.add(n8, 1, 2, 1, 1);
        grid.add(n9, 2, 2, 1, 1);
        grid.add(n0, 0, 3, 1, 1);
        grid.add(botonPunto, 1, 3, 1, 1);
        grid.add(reset, 2, 3, 1, 1);
        grid.add(mas, 4, 0, 1, 1);
        grid.add(menos, 3, 0, 1, 1);
        grid.add(dividir, 3, 1, 1, 1);
        grid.add(multiplicar, 4, 1, 1, 1);
        grid.add(igual, 3, 2, 2, 2);
        igual.setPrefSize(160, 50);

        Scene scene = new Scene(box,400,120);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}