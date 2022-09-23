module com.avezovs.calculate.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.avezovs.calculator to javafx.fxml;
    exports com.avezovs.calculator;
    exports com.avezovs.calculator.controllers;
    opens com.avezovs.calculator.controllers to javafx.fxml;
    exports com.avezovs.calculator.controllers.display;
    opens com.avezovs.calculator.controllers.display to javafx.fxml;
    exports com.avezovs.calculator.controllers.buttons;
    opens com.avezovs.calculator.controllers.buttons to javafx.fxml;
    exports com.avezovs.calculator.controllers.buttons.arithmetic;
    opens com.avezovs.calculator.controllers.buttons.arithmetic to javafx.fxml;
}