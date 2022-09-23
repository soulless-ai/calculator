package com.avezovs.calculator;

import com.avezovs.calculator.controllers.Total;
import com.avezovs.calculator.controllers.WindowControl;
import com.avezovs.calculator.controllers.buttons.Cleaner;
import com.avezovs.calculator.controllers.buttons.NumberButtons;
import com.avezovs.calculator.controllers.buttons.arithmetic.ArithmeticButtons;
import com.avezovs.calculator.controllers.display.FunctionDisplay;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorController {

    @FXML
    public Label cFirstValue;
    @FXML
    public Label cSecondValue;

    @FXML
    public Button closeButton;
    @FXML
    public Button fullScreen;
    @FXML
    public Button rollUp;

    @FXML
    public HBox topBarButtons;

    private void windowButtonsAction() {
        closeButton.setOnAction(WindowControl::closeButtonAction);
        fullScreen.setOnAction(WindowControl::fullScreenAction);
        rollUp.setOnAction(WindowControl::rollUpAction);
    }

    private void topBarDragged() {
        topBar.setOnMousePressed(event -> {
            Stage stage = ((Stage)(((HBox)event.getSource()).getScene().getWindow()));
            xOffset = stage.getX() - event.getScreenX();
            yOffset = stage.getY() - event.getScreenY();
        });
        topBar.setOnMouseDragged(event -> {
            Stage stage = ((Stage)(((HBox)event.getSource()).getScene().getWindow()));
            stage.setX(event.getScreenX() + xOffset);
            stage.setY(event.getScreenY() + yOffset);
        });
    }
    @FXML
    public Button divide;
    @FXML
    public Button multiply;
    @FXML
    public Button subtraction;
    @FXML
    public Button addition;

    private void arithmeticButtonsAction() {
        divide.setOnAction(ArithmeticButtons::divideAction);
        multiply.setOnAction(ArithmeticButtons::multiplyAction);
        subtraction.setOnAction(ArithmeticButtons::subtractionAction);
        addition.setOnAction(ArithmeticButtons::additionAction);
    }

    @FXML
    private AnchorPane ap;
    @FXML
    public Button summa;
    @FXML
    private void summaButtonAction() {
        summa.setOnAction(Total::summaAction);
    }
    public void initialize() {
        numberButtonsAction();
        windowButtonsAction();
        topBarDragged();

        arithmeticButtonsAction();
        summaButtonAction();
        cleanerButtonsAction();

        final boolean[] update = {false};
        AnimationTimer animationTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                cFirstValue.setText(FunctionDisplay.firstV);
                cSecondValue.setText(FunctionDisplay.secondV);
                if (update[0]) {
                    update[0] =false;
                }
            }
        };
        animationTimer.start();
    }
    @FXML
    public Button clearLastField;
    @FXML
    public Button clearChar;
    @FXML
    public Button clearField;

    double xOffset = 0;
    double yOffset = 0;

    private void cleanerButtonsAction() {
        clearLastField.setOnAction(Cleaner::clearLastFieldAction);
        clearChar.setOnAction(Cleaner::clearCharAction);
        clearField.setOnAction(Cleaner::clearFieldAction);
    }
    @FXML
    public Button one;
    @FXML
    public Button two;
    @FXML
    public Button three;
    @FXML
    public Button four;
    @FXML
    public Button five;
    @FXML
    public Button six;
    @FXML
    public Button seven;
    @FXML
    public Button eight;
    @FXML
    public Button nine;
    @FXML
    public Button zero;
    private void numberButtonsAction() {
        one.setOnAction(NumberButtons::clickedOne);
        two.setOnAction(NumberButtons::clickedTwo);
        three.setOnAction(NumberButtons::clickedThree);
        four.setOnAction(NumberButtons::clickedFour);
        five.setOnAction(NumberButtons::clickedFive);
        six.setOnAction(NumberButtons::clickedSix);
        seven.setOnAction(NumberButtons::clickedSeven);
        eight.setOnAction(NumberButtons::clickedEight);
        nine.setOnAction(NumberButtons::clickedNine);
        zero.setOnAction(NumberButtons::clickedZero);
    }

    @FXML
    public VBox main;
    @FXML
    public VBox wrapperStandard;
    @FXML
    public HBox topBar;


    @FXML
    private Label cTitle;

    @FXML
    private HBox cControl;

    @FXML
    private Button cChange;
    @FXML
    private Label cName;
    @FXML
    private HBox cHistory;
}