package cs112.ud2.controllers;

import cs112.ud2.MainApplication;
import cs112.ud2.models.BankSystem;
import cs112.ud2.models.Checkings;
import cs112.ud2.models.Savings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateAccController {
    @FXML
    private TextField nameTextLabel;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField dobTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField ssnTextField;
    @FXML
    private TextField checkingsTextField;
    @FXML
    private TextField savingsTextField;
    @FXML
    private TextField accTypeTextField;
    @FXML
    private Button continueButton;
    @FXML
    private Button backButton;

    //backButton

    //onNameTextTyped

    @FXML
    protected void onNameTextTyped(ActionEvent actionEvent) throws IOException {
        String name = nameTextLabel.getText();
        Checkings checkingsAcc = new Checkings();
        Savings savingsAcc = new Savings();
        checkingsAcc.setName(name);
        savingsAcc.setName(name);

    }

    //onContinueButtonClicked
    @FXML
    protected void onContinueButtonClicked(ActionEvent actionEvent) throws IOException {
        String name = nameTextLabel.getText();
        String email = emailTextField.getText();
        String dob = dobTextField.getText();
        String password = passwordTextField.getText();
        String address = addressTextField.getText();
        int ssn = Integer.parseInt(ssnTextField.getText());
        double checkings = Double.parseDouble(checkingsTextField.getText());
        double savings = Double.parseDouble(savingsTextField.getText());
        String accType = accTypeTextField.getText();

        Parent accCreatedView =  FXMLLoader.load(MainApplication.class.getResource("accCreated-view.fxml"));
        Scene accCreatedViewScene = new Scene(accCreatedView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(accCreatedViewScene);
        window.show();


    }

    //onBackButtonClickedButton
    @FXML
    protected void onBackButtonClickedButton(ActionEvent actionEvent) throws IOException {
        Parent mainView =  FXMLLoader.load(MainApplication.class.getResource("main-view.fxml"));
        Scene mainViewScene = new Scene(mainView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainViewScene);
        window.show();

    }

}
