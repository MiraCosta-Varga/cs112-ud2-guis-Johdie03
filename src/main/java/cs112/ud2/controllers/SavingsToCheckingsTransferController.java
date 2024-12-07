package cs112.ud2.controllers;

import cs112.ud2.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SavingsToCheckingsTransferController {

    @FXML
    private TextField transferAmountTextField;
    //onTransferAmountTyped
    @FXML
    protected void onTransferAmountTyped(ActionEvent actionEvent) throws IOException {
        try {
            Parent transferSuccessfulView = FXMLLoader.load(MainApplication.class.getResource("transferSuccessful-view.fxml"));
            Scene transferSuccessfulViewScene = new Scene(transferSuccessfulView);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(transferSuccessfulViewScene);
            window.show();


        } catch (NullPointerException e) {
            System.err.println("Error: " + e.getMessage());

        }
        double savingsToCheckingsTransferAmount = Double.parseDouble(transferAmountTextField.getText());
        savingsToCheckingsTransfer(savingsToCheckingsTransferAmount);


    }


    //onContinueButtonClicked
    @FXML
    protected void onContinueButtonClicked(ActionEvent actionEvent) throws IOException {
        try {
            Parent transferSuccessfulView = FXMLLoader.load(MainApplication.class.getResource("transferSuccessful-view.fxml"));
            Scene transferSuccessfulViewScene = new Scene(transferSuccessfulView);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(transferSuccessfulViewScene);
            window.show();


        } catch (NullPointerException e) {
            System.err.println("Error: " + e.getMessage());

        }
        double savingsToCheckingsTransferAmount = Double.parseDouble(transferAmountTextField.getText());
        savingsToCheckingsTransfer(savingsToCheckingsTransferAmount);

    }


    @FXML
    protected void onBackButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent transferMoneyView =  FXMLLoader.load(MainApplication.class.getResource("transferMoney-view.fxml"));
        Scene transferMoneyViewScene = new Scene(transferMoneyView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(transferMoneyViewScene);
        window.show();
    }

    public void savingsToCheckingsTransfer(double savingsToCheckignsTransferAmount) {
        checkingsDepositController.checkingsDeposit(savingsToCheckignsTransferAmount);
        savingsWithdrawController.savingsWithdraw(savingsToCheckignsTransferAmount);
    }
}
