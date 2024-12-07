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
        try {
            Parent depositSuccessfulView = FXMLLoader.load(MainApplication.class.getResource("depositSuccessful-view.fxml"));
            Scene depositSuccessfulViewScene = new Scene(depositSuccessfulView);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(depositSuccessfulViewScene);
            window.show();

       /* Parent mainView =  FXMLLoader.load(MainApplication.class.getResource("main-view.fxml"));
        Scene mainViewScene = new Scene(mainView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainViewScene);
        window.show(); */

        } catch (NullPointerException e){
            System.out.println ("Error: " + e.getMessage());

        }

        double savingsDepositAmount = Double.parseDouble(depositAmountTextField.getText());
        savingsDeposit(savingsDepositAmount);

        //TEST
        System.out.println ("Current Total Savings Amount after Deposit: " + ((Savings) users[count - 1]).getTotalSavingsAmount());

    }

    @FXML
    protected void onContinueButtonClicked(ActionEvent actionEvent) throws IOException {
        try {
            Parent depositSuccessfulView = FXMLLoader.load(MainApplication.class.getResource("depositSuccessful-view.fxml"));
            Scene depositSuccessfulViewScene = new Scene(depositSuccessfulView);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(depositSuccessfulViewScene);
            window.show();

        }catch (NullPointerException e){
            System.err.println ("Error: " + e.getMessage());
        }

        double savingsDepositAmount = Double.parseDouble(depositAmountTextField.getText());
        savingsDeposit(savingsDepositAmount);


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
