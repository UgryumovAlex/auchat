package project;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextArea chatArea;

    @FXML
    private TextField textSend;

    @FXML
    private Button buttonSend;

    @FXML
    public void clickSend(ActionEvent actionEvent) {
        chatArea.appendText(textSend.getText()+"\n");
        textSend.clear();
        textSend.requestFocus();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Platform.runLater(() -> {
            textSend.requestFocus();
        });
    }
}
