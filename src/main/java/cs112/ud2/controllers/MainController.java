package cs112.ud2.controllers;

import cs112.ud2.MainApplication;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.event.ActionEvent;

import java.io.IOException;

public class MainController {
    @FXML
    private Button createAccButton;
    @FXML
    private Button feesInfoButton;
    @FXML
    private Button exitButton;

    @FXML
    protected void onCreateAccButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent createAccView =  FXMLLoader.load(MainApplication.class.getResource("createAcc-view.fxml"));
        Scene createAccScene = new Scene(createAccView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(createAccScene);
        window.show();


    }

    //onFeesinfoButtonClicked
    @FXML
    protected void onFeesinfoButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent AccFeesInfoView =  FXMLLoader.load(MainApplication.class.getResource("AccFeesInfo-view.fxml"));
        Scene AccFeesViewScene = new Scene(AccFeesInfoView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(AccFeesViewScene);
        window.show();


    }

    @FXML
    protected void onExitButtonClicked(){
        Platform.exit();
    }


}