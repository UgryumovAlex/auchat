package project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

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
}
