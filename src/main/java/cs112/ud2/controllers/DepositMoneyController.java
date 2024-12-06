package cs112.ud2.controllers;

import cs112.ud2.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DepositMoneyController {

    @FXML
    private Button checkingsDepositButton;

    @FXML
    private Button savingsDepositButton;

    //change parent view to checkingsDepositView once ready
    @FXML
    protected void onCheckingsDepositButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent mainView =  FXMLLoader.load(MainApplication.class.getResource("main-view.fxml"));
        Scene mainViewScene = new Scene(mainView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainViewScene);
        window.show();
    }

    //change parent view to savingsDepositView  once ready
    @FXML
    protected void onSavingsDepositButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent mainView =  FXMLLoader.load(MainApplication.class.getResource("main-view.fxml"));
        Scene mainViewScene = new Scene(mainView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainViewScene);
        window.show();

    }



}
