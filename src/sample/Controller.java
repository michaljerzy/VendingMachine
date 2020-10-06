package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import org.w3c.dom.Text;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private Text txtCash;

    private Float cash;

    public void clicked2zl(MouseEvent mouseEvent) {
        String oldvalue = txtCash.getWholeText();
        float set = 2;
        txtCash.setTextContent(oldvalue + set);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
