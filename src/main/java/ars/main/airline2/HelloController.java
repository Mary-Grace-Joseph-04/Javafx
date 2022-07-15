package ars.main.airline2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ars.main.airline2.application.AirlineController;

import java.io.IOException;

public class HelloController {

    @FXML
    protected void onStartButtonClick() throws IOException {
        AirlineController.changeScene();
    }
}