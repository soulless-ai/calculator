package com.avezovs.calculator.controllers;

import com.avezovs.calculator.controllers.display.FunctionDisplay;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Total extends FunctionDisplay {

    public static boolean divideSum = false;
    public static boolean multiplySum = false;
    public static boolean subtractionSum = false;
    public static boolean additionSum = false;
    @FXML
    public static void summaAction(ActionEvent event) {
       /* if (divideSum) {
            FunctionDisplay.secondV = String.valueOf(Double.parseDouble(String.valueOf(FunctionDisplay.secondV.split(" "))) /
                    Double.parseDouble(String.valueOf(FunctionDisplay.firstV.split(" "))));
        }
        if (multiplySum) {
            FunctionDisplay.secondV = String.valueOf(Double.parseDouble(String.valueOf(FunctionDisplay.secondV.split(" "))) *
                    Double.parseDouble(String.valueOf(FunctionDisplay.firstV.split(" "))));
        }
        if (subtractionSum) {
            FunctionDisplay.secondV = String.valueOf(Double.parseDouble(String.valueOf(FunctionDisplay.secondV.split(" "))) -
                    Double.parseDouble(String.valueOf(FunctionDisplay.firstV.split(" "))));
        }
        if (additionSum) {
            FunctionDisplay.secondV = String.valueOf(Double.parseDouble(FunctionDisplay.secondV.substring(0, 1)) +
                    Double.parseDouble(FunctionDisplay.firstV));
        }*/

    }
}
