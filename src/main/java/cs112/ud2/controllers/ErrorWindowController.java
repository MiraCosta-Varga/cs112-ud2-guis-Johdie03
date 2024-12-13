package cs112.ud2.controllers;

import cs112.ud2.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ErrorWindowController {

    @FXML
    private Label errorMessage;

    @FXML
    private Button continueButton;


    @FXML
    protected void onContinueButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent createAccView =  FXMLLoader.load(MainApplication.class.getResource("createAcc-view.fxml"));
        Scene createAccScene = new Scene(createAccView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(createAccScene);
        window.show();

    }

    public void setErrorMessage(String errorText){
        System.out.println ("Current Error Message: " + errorText);
        errorMessage.setText(errorText);
    }
    public void errorMessages(String error){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/cs112/ud2/errorWindow-view.fxml"));
            Scene scene = new Scene(loader.load());
            ErrorWindowController controller = loader.getController();
            controller.setErrorMessage(error);

            Stage window = new Stage();
            window.setTitle("Error");
            window.setScene(scene);
            window.show();
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(getClass().getResource("errorWindow-view.fxml"));
        controller.setErrorMessage(error);

    }


}
