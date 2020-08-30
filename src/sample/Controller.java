package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.*;

public class Controller {
    @FXML
    Button summMath;
    @FXML
    Button delitMath;
    @FXML
    Button umnMath;
    @FXML
    Button minusMath;
    @FXML
    Label labeltitle;
    String num = "";
    double oper;
    double oper2;
    String znachOper="";
    double result;
    @FXML
    Button num1;
    @FXML
    Button num2;
    @FXML
    Button num3;
    @FXML
    Button num4;
    @FXML
    Button num5;
    @FXML
    Button num6;
    @FXML
    Button num7;
    @FXML
    Button num8;
    @FXML
    Button num9;
    @FXML
    Button num0;
    @FXML
    Button cavith;
    @FXML
    Button plusMinus;

    public void NumAction(ActionEvent actionEvent) {
        if (num1.isArmed()) {
            num = num + 1;
            num1.requestFocus();
        } else if  (num2.isArmed()) {
            num = num + 2;
            num2.requestFocus();
        }  else if  (num3.isArmed()) {
            num = num + 3;
            num3.requestFocus();
        } else if  (num4.isArmed()) {
            num = num + 4;
            num4.requestFocus();
        } else if  (num5.isArmed()) {
            num = num + 5;
            num5.requestFocus();
        } else if  (num6.isArmed()) {
            num = num + 6;
            num6.requestFocus();
        } else if  (num7.isArmed()) {
            num = num + 7;
            num7.requestFocus();
        }  else if  (num8.isArmed()) {
            num = num + 8;
            num8.requestFocus();
        } else if  (num9.isArmed()) {
            num = num + 9;
            num9.requestFocus();
        } else if  (num0.isArmed()) {
            num = num + 0;
            num0.requestFocus();
        } else if  (plusMinus.isArmed()) {
            char aChar = num.charAt(0);
            if(aChar == '-') {
               num.replace('-','+');
            } else {
                num = "-" + num;
            }
            plusMinus.requestFocus();
        }   else if  (cavith.isArmed()) {
            int t = num.indexOf('.');
            if(t > 0) {
            } else {
                num = num + ".";
            }
            cavith.requestFocus();
        }

        labeltitle.setText(num);
    }

    public void clear(ActionEvent actionEvent) {
        labeltitle.setText("0");
        num = "";
    }

    public void operAction(ActionEvent actionEvent) {
        labeltitle.setText("0");
        oper = Double.parseDouble(num);
        num = "";
        if (summMath.isArmed()) {
            znachOper = "+";
            summMath.requestFocus();
        } else if  (minusMath.isArmed()) {
            znachOper = "-";
            minusMath.requestFocus();
        }  else if  (umnMath.isArmed()) {
            znachOper = "*";
            umnMath.requestFocus();
        }  else if  (delitMath.isArmed()) {
            znachOper = "/";
            delitMath.requestFocus();
        }


    }

    public void resultSum(ActionEvent actionEvent) {
        oper2 = Double.parseDouble(num);
        num = "";
        result = operathion(oper,oper2);
        labeltitle.setText(String.valueOf(result));
    }
    public double operathion (double a, double b) {
        double c = 0.0;
        if(znachOper.equals("+")) {
          c =  a + b;
        } else if (znachOper.equals("-")) {
            c =  a - b;
        } else if (znachOper.equals("*")) {
            c =  a * b;
        } else if (znachOper.equals("/")) {
            c =  a / b;
        }
        return  c;
    }
}
