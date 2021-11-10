package com.example.calculatorfx;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.ResourceBundle;

public class Controller {
    private Label pantalla;


    int operador1;
    int operador2;
    int resultado;


    public Controller(Label pantalla){
        this.pantalla=pantalla;

    }

    EventHandler<MouseEvent> sumar = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
            pantalla.setText(String.valueOf(operador1+operador2));
        }
    };




}