package com.avezovs.calculator.controllers.buttons;

import com.avezovs.calculator.CalculatorController;
import com.avezovs.calculator.controllers.display.FunctionDisplay;
import com.avezovs.calculator.controllers.display.Separator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.util.Objects;

public class NumberButtons extends CalculatorController {


    @FXML
    public static void clickedOne(ActionEvent event) {
        setValue("1");
    }
    @FXML
    public static void clickedTwo(ActionEvent event) {
        setValue("2");
    }
    @FXML
    public static void clickedThree(ActionEvent event) {
        setValue("3");
    }
    @FXML
    public static void clickedFour(ActionEvent event) {
        setValue("4");
    }
    @FXML
    public static void clickedFive(ActionEvent event) {
        setValue("5");
    }
    @FXML
    public static void clickedSix(ActionEvent event) {
        setValue("6");
    }
    @FXML
    public static void clickedSeven(ActionEvent event) {
        setValue("7");
    }
    @FXML
    public static void clickedEight(ActionEvent event) {
        setValue("8");
    }
    @FXML
    public static void clickedNine(ActionEvent event) {
        setValue("9");
    }
    @FXML
    public static void clickedZero(ActionEvent event) {
        setValue("0");
    }
    @FXML
    private static void setValue(String number) {
        Separator.chainger();
        if (checkLabel()) {
            FunctionDisplay.secondV = number;
        } else if (FunctionDisplay.secondV.length() < 12) {
            FunctionDisplay.secondV = FunctionDisplay.secondV + number;
        } else {
            updateSize(12, "42", number);
            updateSize(13, "39", number);
            updateSize(14, "36", number);
            updateSize(15, "33", number);
            updateSize(16, "33", number);
        }
        Separator.clicks++;
    }

    @FXML
    private static void updateSize(int textLength, String size, String i) {
        if (FunctionDisplay.secondV.length() >= 12) {
            // secondValue.setStyle("-fx-font-size: " + size +"; -fx-alignment: center;");
        } else {
            FunctionDisplay.secondV = FunctionDisplay.secondV + i;
        }
    }
    @FXML
    private static boolean checkLabel() {
        return Objects.equals(FunctionDisplay.secondV, "0");
    }
}
