package com.ussd.ussdplateform;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ussdController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}