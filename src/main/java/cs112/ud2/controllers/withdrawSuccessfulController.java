package cs112.ud2.controllers;

import cs112.ud2.MainApplication;
import cs112.ud2.models.Checkings;
import cs112.ud2.models.Savings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.ud2.controllers.CreateAccController.count;
import static cs112.ud2.controllers.CreateAccController.users;

public class withdrawSuccessfulController {

    //onContinueButtonClicked
    @FXML
    protected void onContinueButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent homepageView =  FXMLLoader.load(MainApplication.class.getResource("homepage-view.fxml"));
        Scene homepageViewScene = new Scene(homepageView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(homepageViewScene);
        window.show();

        System.out.println ("Current Total Checkings Amount after Withdraw: " + ((Checkings) users[count - 2]).getTotalCheckingsAmount());
        System.out.println ("Current Total Savings Amount after Withdraw: " + ((Savings) users[count - 1]).getTotalSavingsAmount());
    }
}
