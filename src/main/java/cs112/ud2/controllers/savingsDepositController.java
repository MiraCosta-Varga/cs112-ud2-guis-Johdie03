package cs112.ud2.controllers;

import cs112.ud2.models.BankSystem;
import cs112.ud2.models.Savings;
import cs112.ud2.MainApplication;
import cs112.ud2.models.Checkings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.ud2.controllers.CreateAccController.count;
import static cs112.ud2.controllers.CreateAccController.users;

public class savingsDepositController {
    @FXML
    private TextField depositAmountTextField;

    //onSavingsAmountTyped
    @FXML
    protected void onDepositAmountTyped(ActionEvent actionEvent) throws IOException{
        double savingsDepositAmount = Double.parseDouble(depositAmountTextField.getText());
        savingsDeposit(savingsDepositAmount);

        Parent homepageView =  FXMLLoader.load(MainApplication.class.getResource("homepage-view.fxml"));
        Scene homepageViewScene = new Scene(homepageView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(homepageViewScene);
        window.show();

        //TEST
        System.out.println ("Current Total Savings Amount after Deposit: " + ((Savings) users[count - 2]).getTotalSavingsAmount());

    }

    @FXML
    protected void onContinueButtonClicked(ActionEvent actionEvent) throws IOException {
        double savingsDepositAmount = Double.parseDouble(depositAmountTextField.getText());
        savingsDeposit(savingsDepositAmount);

        Parent homepageView =  FXMLLoader.load(MainApplication.class.getResource("homepage-view.fxml"));
        Scene homepageViewScene = new Scene(homepageView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(homepageViewScene);
        window.show();

        //TEST
        System.out.println ("Current Total Savings Amount after Deposit: " + ((Savings) users[count - 1]).getTotalSavingsAmount());

    }

    @FXML
    protected void onBackButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent depositMoneyView =  FXMLLoader.load(MainApplication.class.getResource("depositMoney-view.fxml"));
        Scene depositMoneyViewScene = new Scene(depositMoneyView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(depositMoneyViewScene);
        window.show();
    }

    public void savingsDeposit(double savingsDepositAmount) {
        double totalSavingsAmount=  ((Savings) users[count - 1]).getTotalSavingsAmount();
        totalSavingsAmount += savingsDepositAmount;
        ((Savings) users[count - 1]).setTotalSavings(totalSavingsAmount);
    }
}
