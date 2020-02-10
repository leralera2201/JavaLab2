package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    ObservableList<String> choiceboxx = FXCollections.observableArrayList("NULL", "TRUE", "FALSE");
    @FXML
    private Button btn;

    @FXML
    private Label label1;

    @FXML
    private ChoiceBox<String> choicebox1;

    @FXML
    private ChoiceBox<String> choicebox2;

    @FXML
    private Label label4;

    @FXML
    private Label label3;

    @FXML
    private Label label2;

    @FXML
    private Label label5;

    @FXML
    private Label label8;

    @FXML
    private Label label7;

    @FXML
    private Label label6;

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private TextField text3;

    @FXML
    private TextField text4;

    @FXML
    private TextField text5;

    @FXML
    private TextField text6;

    @FXML
    private TextField text7;

    @FXML
    private TextField text8;

    @FXML
    private TextField text9;

    @FXML
    private TextField text10;

    @FXML
    private TextField text11;

    @FXML
    private TextField text12;

    @FXML
    private TextField text13;

    @FXML
    private TextField text14;

    @FXML
    private TextField text15;

    @FXML
    private TextField text16;

    @FXML
    private Label label31;

    @FXML
    private Label label32;

    @FXML
    private Label label41;

    @FXML
    private Label label411;

    @FXML
    private Label label4111;

    @FXML
    private Label label51;

    @FXML
    private Label label52;

    @FXML
    private Label label521;
    @FXML
    private void initialize() {
        choicebox1.setItems(choiceboxx);
        choicebox2.setItems(choiceboxx);
        choicebox1.setValue("NULL");
        choicebox2.setValue("NULL");
    }
    @FXML
    void onClick(ActionEvent event) {
        BooleanCalculator bc = new BooleanCalculator(choicebox1.getValue(), choicebox2.getValue());
        text1.setText(bc.number1());
        text2.setText(bc.number2());
        text3.setText(bc.number3());
        text4.setText(bc.number4());
        text5.setText(bc.number5());
        text6.setText(bc.number6());
        text7.setText(bc.number7());
        text8.setText(bc.number8());
        text9.setText(bc.number9());
        text10.setText(bc.number10());
        text11.setText(bc.number11());
        text12.setText(bc.number12());
        text13.setText(bc.number13());
        text14.setText(bc.number14());
        text15.setText(bc.number15());
        text16.setText(bc.number16());
    }

}
