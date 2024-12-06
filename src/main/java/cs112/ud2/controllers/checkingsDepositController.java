package cs112.ud2.controllers;


import cs112.ud2.models.BankSystem;
import cs112.ud2.models.Checkings;
import cs112.ud2.models.Savings;
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
        checkingsDeposit(checkingsDepositAmount);

        Parent homepageView =  FXMLLoader.load(MainApplication.class.getResource("homepage-view.fxml"));
        Scene homepageViewScene = new Scene(homepageView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(homepageViewScene);
        window.show();

        //TEST
        System.out.println ("Current Total Checkings Amount after Deposit: " + ((Checkings) users[count - 2]).getTotalCheckingsAmount());

    }

    public void checkingsDeposit(double checkingsDepositAmount) {
      double totalCheckingsAmount=  ((Checkings) users[count - 2]).getTotalCheckingsAmount();
      totalCheckingsAmount += checkingsDepositAmount;
      ((Checkings) users[count - 2]).setTotalCheckingsAmount(totalCheckingsAmount);
    }
}
