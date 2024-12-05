package cs112.ud2.controllers;

import cs112.ud2.MainApplication;
import cs112.ud2.models.BankSystem;
import cs112.ud2.models.Checkings;
import cs112.ud2.models.Savings;
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

public class CreateAccController {
    @FXML
    private TextField nameTextLabel;
    @FXML
    private Button continueButton;

    //onNameTextTyped

    @FXML
    protected void onNameTextTyped(ActionEvent actionEvent) throws IOException {
        String name = nameTextLabel.getText();
        Checkings checkingsAcc = new Checkings();
        Savings savingsAcc = new Savings();
        checkingsAcc.setName(name);
        savingsAcc.setName(name);

    }

    //onContinueButtonClicked
    @FXML
    protected void onContinueButtonClicked(ActionEvent actionEvent) throws IOException {
/*
        Parent AccFeesInfoView =  FXMLLoader.load(MainApplication.class.getResource("AccFeesInfo-view.fxml"));
        Scene AccFeesViewScene = new Scene(AccFeesInfoView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(AccFeesViewScene);
        window.show();
 */

    }

}
