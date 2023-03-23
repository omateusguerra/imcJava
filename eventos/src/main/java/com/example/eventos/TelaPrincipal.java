package com.example.eventos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaPrincipal extends Application {

@Override
public void start (Stage stage) throws Exception{

    //Criando layout
    AnchorPane layout = new AnchorPane();
    layout.setPrefSize(400, 300);

    //Criando componentes
    TextField tfPeso = new TextField();
    tfPeso.setPromptText("Peso");
    TextField tfAltura = new TextField();
    tfAltura.setPromptText("altura");

    Button button = new Button("Clique");
    Label label = new Label();

    //Posicionamento dos componentes
    layout.getChildren().addAll(tfPeso, tfAltura, label, button);

    Scene scene = new Scene(layout);

    stage.setScene(scene);
    stage.show();

    tfPeso.setLayoutX(10);
    tfPeso.setLayoutY(10);

    tfAltura.setLayoutX(10);
    tfAltura.setLayoutY(tfPeso.getLayoutY() + tfPeso.getHeight() + 10);

    button.setLayoutX(10);
    button.setLayoutY(tfAltura.getLayoutY() + tfAltura.getHeight() + 10);

    label.setLayoutX(tfPeso.getLayoutX() + tfPeso.getWidth() + 10);
    label.setLayoutY(10);

    button.setOnAction(e -> {
        double peso = Double.parseDouble(tfPeso.getText());
        double altura = Double.parseDouble(tfAltura.getText());
        Double imc = peso/(altura*altura);
        label.setText(String.valueOf(imc));
    });
}

public static void main(String[] args) {
    launch(args);
}
}
