package com.avezovs.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class Calculator extends Application {
    double xOffset = 0;
    double yOffset = 0;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Calculator.class.getResource("calc.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 320, 560);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("css/style.css")).toExternalForm());

        stage.getIcons().add(new Image(Objects.requireNonNull(Calculator.class.getResource("img/favicon.png")).openStream()));
        stage.setTitle("calculator");
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}