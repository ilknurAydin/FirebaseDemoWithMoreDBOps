package aydin.firebasedemo;

import java.io.IOException;

import aydin.firebasedemo.DemoApp;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        DemoApp.setRoot("primary");
    }
}
