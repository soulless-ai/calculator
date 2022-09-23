package com.avezovs.calculator.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.Window;

public class WindowControl {
    static double wight;
    static double height;
    static double pageX;
    static double pageY;

    private static final Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

    @FXML
    public static void closeButtonAction(ActionEvent event) {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }
    @FXML
    public static void fullScreenAction(ActionEvent event) {
        Stage stage = (Stage)(((Button)event.getSource()).getScene().getWindow());

        wight = stage.getWidth();
        height = stage.getHeight();
        pageX = stage.getX();
        pageY = stage.getY();

        Button nonFullScreen = new Button("❐");

        stage.setX(primaryScreenBounds.getMinX());
        stage.setY(primaryScreenBounds.getMinY());
        stage.setWidth(primaryScreenBounds.getWidth());
        stage.setHeight(primaryScreenBounds.getHeight());

        stage.show();
    }
    @FXML
    public static void rollUpAction(ActionEvent event) {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).setIconified(true);
    }

    @FXML
    private static HBox topBar;
    @FXML
    public static void topBarPressed(ActionEvent event) {
        Node source = (Node) event.getSource();
        Window stage = source.getScene().getWindow();

        topBar.setOnMouseDragged(event1 -> {
            stage.setX(event1.getX());
            stage.setY(event1.getY());
        });
    }
}
