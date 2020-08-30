package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.*;

public class Controller {
    @FXML
    Label labeltitle;
    String num = "";
    String numUser = "";
    int oper;
    int oper2;
    int znachSum;
    int result;
    @FXML
    Button num1;
    @FXML
    Button num2;
    public void NumAction(ActionEvent actionEvent) {
        if (num1.isArmed()) {
            num = num + 1;
        } else if  (num2.isArmed()) {
            num = num + 2;
        }
        labeltitle.setText(num);
    }

    public void clear(ActionEvent actionEvent) {
        labeltitle.setText("0");
        num = "";
    }

    public void operAction(ActionEvent actionEvent) {
        labeltitle.setText("0");
        oper = Integer.parseInt(num);
        num = "";
    }

    public void resultSum(ActionEvent actionEvent) {
        oper2 = Integer.parseInt(num);
        num = "";
        result = oper + oper2;
        labeltitle.setText(String.valueOf(result));
    }
}
