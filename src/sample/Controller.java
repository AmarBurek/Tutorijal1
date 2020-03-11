package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Button dugme;
    public Label poruka;

    public void reciHello(ActionEvent actionEvent) {
        System.out.println("Hello World");
        poruka.setText("Hello World");
    }
}
