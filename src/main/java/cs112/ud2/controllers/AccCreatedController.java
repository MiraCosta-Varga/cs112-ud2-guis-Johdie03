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

public class AccCreatedController {
    @FXML
    private Button continueButton;

    //onContinueButtonClicked
    //change to homepage view not main once homepage is completed
    @FXML
    protected void onContinueButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent homepageView =  FXMLLoader.load(MainApplication.class.getResource("homepage-view.fxml"));
        Scene homepageViewScene = new Scene(homepageView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(homepageViewScene);
        window.show();

    }
}
