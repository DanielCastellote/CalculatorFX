package com.example.calculatorfx;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import static javafx.scene.input.MouseEvent.MOUSE_CLICKED;

public class Vista extends Parent {
    GridPane grid;
    Label pantalla;
    VBox box;
    Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,mas,menos,multiplicar,dividir,reset,botonPunto,igual;
    Controller contr;

    public Vista() {

        initcomponents();
        //añadirOperaciones();
    }

    public void initcomponents() {

        grid = new GridPane();
        pantalla = new Label();
        contr= new Controller(pantalla);
        box = new VBox(pantalla);
        n1 = new Button("1");
        n2 = new Button("2");
        n3 = new Button("3");
        n4 = new Button("4");
        n5 = new Button("5");
        n6 = new Button("6");
        n7 = new Button("7");
        n8 = new Button("8");
        n9 = new Button("9");
        n0 = new Button("0");
        mas = new Button("+");
        menos = new Button("-");
        dividir = new Button("/");
        multiplicar = new Button("x");
        igual = new Button("=");
        botonPunto = new Button(".");
        reset = new Button("CE");

        //pantalla.setPrefSize(100, 10);
        box.getChildren().add(grid);
        //box.setPrefWidth(80);
        box.setAlignment(Pos.TOP_RIGHT);


        grid.getChildren().addAll(n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, botonPunto, reset, mas, menos, dividir, multiplicar, igual);

        GridPane.setConstraints(n1, 0, 0, 1, 1);
        GridPane.setConstraints(n2, 1, 0, 1, 1);
        GridPane.setConstraints(n3, 2, 0, 1, 1);
        GridPane.setConstraints(n4, 0, 1, 1, 1);
        GridPane.setConstraints(n5, 1, 1, 1, 1);
        GridPane.setConstraints(n6, 2, 1, 1, 1);
        GridPane.setConstraints(n7, 0, 2, 1, 1);
        GridPane.setConstraints(n8, 1, 2, 1, 1);
        GridPane.setConstraints(n9, 2, 2, 1, 1);
        GridPane.setConstraints(n0, 0, 3, 1, 1);
        GridPane.setConstraints(botonPunto, 1, 3, 1, 1);
        GridPane.setConstraints(reset, 2, 3, 1, 1);
        GridPane.setConstraints(mas, 4, 0, 1, 1);
        GridPane.setConstraints(menos, 3, 0, 1, 1);
        GridPane.setConstraints(dividir, 3, 1, 1, 1);
        GridPane.setConstraints(multiplicar, 4, 1, 1, 1);
        GridPane.setConstraints(igual, 3, 2, 2, 2);

        //this.getChildren().add(pantalla);
        this.getChildren().add(box);
        //this.getChildren().add(grid);

        n0.setPrefSize(40,40);
        n1.setPrefSize(40,40);
        n2.setPrefSize(40,40);
        n3.setPrefSize(40,40);
        n4.setPrefSize(40,40);
        n5.setPrefSize(40,40);
        n6.setPrefSize(40,40);
        n7.setPrefSize(40,40);
        n8.setPrefSize(40,40);
        n9.setPrefSize(40,40);
        n0.setPrefSize(40,40);
        mas.setPrefSize(40,40);
        menos.setPrefSize(40,40);
        multiplicar.setPrefSize(40,40);
        dividir.setPrefSize(40,40);
        reset.setPrefSize(40,40);
        botonPunto.setPrefSize(40,40);
        igual.setPrefSize(80, 80);

        n1.setOnAction(e->contr.manejarBotonNumerico(e));
        n2.setOnAction(e->contr.manejarBotonNumerico(e));
        n3.setOnAction(e->contr.manejarBotonNumerico(e));
        n4.setOnAction(e->contr.manejarBotonNumerico(e));
        n5.setOnAction(e->contr.manejarBotonNumerico(e));
        n6.setOnAction(e->contr.manejarBotonNumerico(e));
        n7.setOnAction(e->contr.manejarBotonNumerico(e));
        n8.setOnAction(e->contr.manejarBotonNumerico(e));
        n9.setOnAction(e->contr.manejarBotonNumerico(e));
        n0.setOnAction(e->contr.manejarBotonNumerico(e));
        mas.setOnAction(e->contr.manejarBotonOperacion(e));
        menos.setOnAction(e->contr.manejarBotonOperacion(e));
        multiplicar.setOnAction(e->contr.manejarBotonOperacion(e));
        dividir.setOnAction(e->contr.manejarBotonOperacion(e));
        igual.setOnAction(e->contr.manejarBotonResultado(e));

        reset.setOnAction(e->contr.limpiar(e));


    }




}
