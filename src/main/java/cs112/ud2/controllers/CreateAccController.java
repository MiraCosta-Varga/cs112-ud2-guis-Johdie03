package cs112.ud2.controllers;

import cs112.ud2.models.BankSystem;
import cs112.ud2.models.Checkings;
import cs112.ud2.models.Savings;
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
    static BankSystem[] users = new BankSystem[50];
    static int count = 0;
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


    //onContinueButtonClicked
    @FXML
    protected void onContinueButtonClicked(ActionEvent actionEvent) throws IOException {
        String name = nameTextLabel.getText();
        String email = emailTextField.getText();
        String birthday = dobTextField.getText();
        String password = passwordTextField.getText();
        String address = addressTextField.getText();
        int ssn = Integer.parseInt(ssnTextField.getText());
        double checkingsAmount = Double.parseDouble(checkingsTextField.getText());
        double savingsAmount = Double.parseDouble(savingsTextField.getText());
        String accType = accTypeTextField.getText();
       users[count++] = new Checkings(name, email, password, address, birthday, ssn, accType,
               checkingsAmount);
       users[count++] = new Savings(name, email, password, address, birthday, ssn, accType, savingsAmount);

        Parent accCreatedView =  FXMLLoader.load(MainApplication.class.getResource("accCreated-view.fxml"));
        Scene accCreatedViewScene = new Scene(accCreatedView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(accCreatedViewScene);
        window.show();

        CreateAccController.setAll(users, name, email, birthday, password, address, ssn, checkingsAmount, savingsAmount, accType);

        //TEST

        Checkings test1 = new Checkings(name, email, password, address, birthday, ssn, accType,
                checkingsAmount);
        Savings test2 = new Savings(name, email, password, address, birthday, ssn, accType, savingsAmount);
        System.out.println (test1.toString());
        System.out.println (test2.toString());

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

    public static void setAll(BankSystem[] users, String name, String email, String birthday, String password, String address, int ssn, double checkingsAmount, double savingsAmount, String accType){
//        users[count++] = new Checkings(name, email, password, address, birthday, ssn, accType,
//                checkingsAmount);
//        users[count++] = new Savings(name, email, password, address, birthday, ssn, accType, savingsAmount);
        users[count - 2].setName(name);
        users[count - 1].setName(name);

        users[count - 2].setEmail(email);
        users[count - 1].setEmail(email);

        users[count - 2].setBirthday(birthday);
        users[count - 1].setBirthday(birthday);

        users[count - 2].setPassword(password);
        users[count - 1].setPassword(password);

        users[count - 2].setAddress(address);
        users[count - 1].setAddress(address);

        users[count - 2].setSsn(ssn);
        users[count - 1].setSsn(ssn);

        ((Checkings) users[count - 2]).setCheckingsAmount(checkingsAmount);
        ((Savings) users[count - 1]).setSavingsAmount(savingsAmount);

        users[count - 2].setAccType(accType);
        users[count - 1].setAccType(accType);

    }


}
