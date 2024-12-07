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

public class HomepageController {
    @FXML
    private Button depositButton;

    @FXML
    private Button withdrawButton;

    @FXML
    private Button transferButton;


    @FXML
    protected void onDepositButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent depositMoneyView =  FXMLLoader.load(MainApplication.class.getResource("depositMoney-view.fxml"));
        Scene depositMoneyViewScene = new Scene(depositMoneyView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(depositMoneyViewScene);
        window.show();

    }

    @FXML
    protected void onWithdrawButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent withdrawMoneyView =  FXMLLoader.load(MainApplication.class.getResource("withdrawMoney-view.fxml"));
        Scene withdrawMoneyViewScene = new Scene(withdrawMoneyView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(withdrawMoneyViewScene);
        window.show();

    }

    @FXML
    protected void onTransferButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent transferMoneyView =  FXMLLoader.load(MainApplication.class.getResource("transferMoney-view.fxml"));
        Scene transferMoneyViewScene = new Scene(transferMoneyView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(transferMoneyViewScene);
        window.show();

    }




}
