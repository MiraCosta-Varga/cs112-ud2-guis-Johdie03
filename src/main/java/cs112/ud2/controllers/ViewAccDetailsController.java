package cs112.ud2.controllers;

import cs112.ud2.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewAccDetailsController {
    @FXML
    private Label nameLabel;
    @FXML
    private Label accTypeLabel;
    @FXML
    private Label checkingsBalanceLabel;
    @FXML
    private Label savingsBalanceLabel;

    public void displayAccDetails(String name, String accType, double checkingsBalance, double savingsBalance){
        nameLabel.setText(name);
        accTypeLabel.setText(accType);
        checkingsBalanceLabel.setText(String.valueOf(checkingsBalance));
        savingsBalanceLabel.setText(String.valueOf(savingsBalance));
    }

    //onContinueButtonClicked
    @FXML
    protected void onContinueButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent homepageView = FXMLLoader.load(MainApplication.class.getResource("homepage-view.fxml"));
        Scene homepageViewScene = new Scene(homepageView);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(homepageViewScene);
        window.show();
    }

}
