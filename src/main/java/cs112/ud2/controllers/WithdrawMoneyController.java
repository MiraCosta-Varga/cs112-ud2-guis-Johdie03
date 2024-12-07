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

public class WithdrawMoneyController {
    @FXML
    private Button checkingsWithdrawButton;
    @FXML
    private Button savingsWithdrawButton;
    @FXML
    private Button homepageButton;

    //change parent view to checkings withdraw view once ready
    @FXML
    protected void onCheckingsWithdrawButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent checkingsWithdrawView =  FXMLLoader.load(MainApplication.class.getResource("checkingsWithdraw-view.fxml"));
        Scene checkingsWithdrawViewScene = new Scene(checkingsWithdrawView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(checkingsWithdrawViewScene);
        window.show();
    }

    //change parent view to savings withdraw view once ready
    @FXML
    protected void onSavingsWithdrawButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent mainView =  FXMLLoader.load(MainApplication.class.getResource("main-view.fxml"));
        Scene mainViewScene = new Scene(mainView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainViewScene);
        window.show();
    }


    @FXML
    protected void onHomepageButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent homepageView =  FXMLLoader.load(MainApplication.class.getResource("homepage-view.fxml"));
        Scene homepageViewScene = new Scene(homepageView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(homepageViewScene);
        window.show();

    }
}
