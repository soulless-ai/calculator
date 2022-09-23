package com.avezovs.calculator.controllers.buttons;

import com.avezovs.calculator.CalculatorController;
import com.avezovs.calculator.controllers.display.FunctionDisplay;
import com.avezovs.calculator.controllers.display.Separator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Cleaner extends CalculatorController {

    private static final String CSS_FINAL_SIZE = "-fx-font-size: 45px;";

    @FXML
    public static void clearLastFieldAction(ActionEvent event) {
        clearSecondValue();
    }
    @FXML
    public static void  clearFieldAction(ActionEvent event) {
        if (!FunctionDisplay.firstV.equals("0")) {
            FunctionDisplay.firstV = " ";
        }
        clearSecondValue();
    }
    @FXML
    public static void clearCharAction(ActionEvent event) {
        if (FunctionDisplay.secondV.length() > 1) {
            FunctionDisplay.secondV = removeLastCharRegex(FunctionDisplay.secondV);

            //secondValue.setStyle(CSS_FINAL_SIZE);
            //changeSize(12, "43");
            //changeSize(13, "40");
            //changeSize(14, "37");
            //changeSize(15, "35");
            //changeSize(16, "33");

            Separator.clicks--;
        } else {
            clearSecondValue();
        }
    }
    //private static void changeSize(int textLength, String size) {
        //if (secondValue.getText().length() >= textLength)
            //secondValue.setStyle("-fx-font-size: " + size + ";");
    //}
    private static void clearSecondValue() {
        FunctionDisplay.secondV = "0";
        //secondValue.setStyle(CSS_FINAL_SIZE);
        Separator.clicks = 0;
    }
    public static String removeLastCharRegex(String s) {
        return (s == null) ? null : s.replaceAll(".$", "");
    }
}
