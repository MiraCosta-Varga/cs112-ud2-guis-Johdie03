package cs112.ud2.controllers;


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

public class checkingsWithdrawController {
    @FXML
    private TextField withdrawAmountTextField;

    @FXML
    protected void onWithdrawAmountTyped(ActionEvent actionEvent) throws IOException {
        try {
            Parent depositSuccessfulView = FXMLLoader.load(MainApplication.class.getResource("withdrawSuccessful-view.fxml"));
            Scene depositSuccessfulViewScene = new Scene(depositSuccessfulView);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(depositSuccessfulViewScene);
            window.show();

        }catch (NullPointerException e){
            System.err.println ("Error: " + e.getMessage());
        }
        double checkingsWithdrawAmount = Double.parseDouble(withdrawAmountTextField.getText());
        checkingsWithdraw(checkingsWithdrawAmount);



        //TEST
        //System.out.println ("Current Total Checkings Amount after Withdraw: " + ((Checkings) users[count - 2]).getTotalCheckingsAmount());

    }

    //onContinueButtonClicked
    @FXML
    protected void onContinueButtonClicked(ActionEvent actionEvent) throws IOException {
        try {
            Parent depositSuccessfulView = FXMLLoader.load(MainApplication.class.getResource("withdrawSuccessful-view.fxml"));
            Scene depositSuccessfulViewScene = new Scene(depositSuccessfulView);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(depositSuccessfulViewScene);
            window.show();

        }catch (NullPointerException e){
            System.err.println ("Error: " + e.getMessage());
        }
        double checkingsWithdrawAmount = Double.parseDouble(withdrawAmountTextField.getText());
        checkingsWithdraw(checkingsWithdrawAmount);



        //TEST
        //System.out.println ("Current Total Checkings Amount after Withdraw: " + ((Checkings) users[count - 2]).getTotalCheckingsAmount());
    }

    @FXML
    protected void onBackButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent withdrawMoney =  FXMLLoader.load(MainApplication.class.getResource("withdrawMoney-view.fxml"));
        Scene withdrawMoneyScene = new Scene(withdrawMoney);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(withdrawMoneyScene);
        window.show();
    }

    public static void checkingsWithdraw(double checkingsWithdrawAmount) {
        double totalCheckingsAmount = ((Checkings) users[count - 2]).getTotalCheckingsAmount();
        totalCheckingsAmount -= checkingsWithdrawAmount;
        ((Checkings) users[count - 2]).setTotalCheckingsAmount(totalCheckingsAmount);

    }
}
