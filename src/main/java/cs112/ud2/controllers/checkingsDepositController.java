package cs112.ud2.controllers;

import cs112.ud2.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class checkingsDepositController {
    @FXML
    private TextField depositAmountTextField;


    @FXML
    protected void onDepositAmountTyped(ActionEvent actionEvent) throws IOException {
        Parent mainView =  FXMLLoader.load(MainApplication.class.getResource("main-view.fxml"));
        Scene mainViewScene = new Scene(mainView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainViewScene);
        window.show();
    }

    //onContinueButtonClicked
    protected void onContinueButtonClicked(ActionEvent actionEvent) throws IOException {
        double checkingsDepositAmount = Double.parseDouble(depositAmountTextField.getText());

    }
}
