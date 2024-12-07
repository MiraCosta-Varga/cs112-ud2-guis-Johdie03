package cs112.ud2.controllers;


import cs112.ud2.models.BankSystem;
import cs112.ud2.models.Checkings;
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

import static cs112.ud2.controllers.CreateAccController.count;
import static cs112.ud2.controllers.CreateAccController.users;

public class checkingsDepositController {
    @FXML
    private TextField depositAmountTextField;

    //onDepositAmountTyped
    @FXML
    protected void onDepositAmountTyped(ActionEvent actionEvent) throws IOException {
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
            System.err.println ("Error: " + e.getMessage());

        }
        double checkingsDepositAmount = Double.parseDouble(depositAmountTextField.getText());
        checkingsDeposit(checkingsDepositAmount);


        //TEST
        System.out.println ("Current Total Checkings Amount after Deposit: " + ((Checkings) users[count - 2]).getTotalCheckingsAmount());
    }


    //onContinueButtonClicked
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
        double checkingsDepositAmount = Double.parseDouble(depositAmountTextField.getText());
        checkingsDeposit(checkingsDepositAmount);



        //TEST
        System.out.println(getClass().getResource("depositSuccessful-view.fxml"));
        System.out.println ("Current Total Checkings Amount after Deposit: " + ((Checkings) users[count - 2]).getTotalCheckingsAmount());

    }



    //onBackButtonClicked
    @FXML
    protected void onBackButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent depositMoneyView =  FXMLLoader.load(MainApplication.class.getResource("depositMoney-view.fxml"));
        Scene depositMoneyViewScene = new Scene(depositMoneyView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(depositMoneyViewScene);
        window.show();
    }


    public void checkingsDeposit(double checkingsDepositAmount) {
      double totalCheckingsAmount=  ((Checkings) users[count - 2]).getTotalCheckingsAmount();
      totalCheckingsAmount += checkingsDepositAmount;
      ((Checkings) users[count - 2]).setTotalCheckingsAmount(totalCheckingsAmount);
    }
}
