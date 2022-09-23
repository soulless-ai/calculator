package com.avezovs.calculator.controllers.buttons.arithmetic;

import com.avezovs.calculator.controllers.Total;
import com.avezovs.calculator.controllers.display.FunctionDisplay;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static com.avezovs.calculator.controllers.buttons.Cleaner.clearLastFieldAction;

public class ArithmeticButtons extends Total {

    @FXML
    public static void divideAction(ActionEvent event) {
        FunctionDisplay.firstV = FunctionDisplay.firstV + FunctionDisplay.secondV + " ÷";
        clearLastFieldAction(event);
        divideSum = true;
    }
    @FXML
    public static void multiplyAction(ActionEvent event) {
        FunctionDisplay.firstV = FunctionDisplay.firstV + FunctionDisplay.secondV + " ✕";
        clearLastFieldAction(event);
        multiplySum = true;
    }
    @FXML
    public static void subtractionAction(ActionEvent event) {
        FunctionDisplay.firstV = FunctionDisplay.firstV + FunctionDisplay.secondV + " ─";
        clearLastFieldAction(event);
        subtractionSum = true;
    }
    @FXML
    public static void additionAction(ActionEvent event) {
        FunctionDisplay.firstV = FunctionDisplay.firstV + FunctionDisplay.secondV + " +";
        clearLastFieldAction(event);
        additionSum = true;
    }

}
