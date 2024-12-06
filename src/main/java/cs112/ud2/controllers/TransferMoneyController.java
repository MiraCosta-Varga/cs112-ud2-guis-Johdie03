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

public class TransferMoneyController {
    @FXML
    private Button checkingsToSavingsTransferButton;
    @FXML
    private Button savingsToCheckingsTransferButton;

    //onCheckingsToSavingsTransferButtonClicked
    @FXML
    protected void onCheckingsToSavingsTransferButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent homepageView =  FXMLLoader.load(MainApplication.class.getResource("homepage-view.fxml"));
        Scene homepageViewScene = new Scene(homepageView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(homepageViewScene);
        window.show();

    }
    //onSavingsToCheckingsTransferButtonClicked
    @FXML
    protected void onSavingsToCheckingsTransferButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent homepageView =  FXMLLoader.load(MainApplication.class.getResource("homepage-view.fxml"));
        Scene homepageViewScene = new Scene(homepageView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(homepageViewScene);
        window.show();

    }

    //onHomepageButtonClicked
    @FXML
    protected void onHomepageButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent homepageView =  FXMLLoader.load(MainApplication.class.getResource("homepage-view.fxml"));
        Scene homepageViewScene = new Scene(homepageView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(homepageViewScene);
        window.show();

    }
}
