package com.avezovs.calculator.controllers.display;

import com.avezovs.calculator.CalculatorController;
import javafx.fxml.FXML;

public class Separator extends CalculatorController {

    @FXML
    public static int clicks = 0;
    private static int endIndex = 3;
    private static int endStartIndex = 5;
    public static void chainger() {
        if (clicks == 3) {
            String s = "";
            if (FunctionDisplay.secondV.length() >= 3) {
                if (FunctionDisplay.secondV.length() > 4) {
                    s = FunctionDisplay.secondV.substring(endStartIndex);
                }
                FunctionDisplay.secondV = FunctionDisplay.secondV.substring(0, endIndex) + '.' + s;
                endIndex+= 4;
                if (FunctionDisplay.secondV.length() > 4) {
                    endStartIndex+= 4;
                }
            }
            clicks = 0;

        }

    }
}
