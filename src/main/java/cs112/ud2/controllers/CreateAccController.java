package cs112.ud2.controllers;

import cs112.ud2.models.*;
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
import java.util.Scanner;

import java.io.IOException;

public class CreateAccController {
    static BankSystem[] users = new BankSystem[50];
    static int count = 0;
    static Scanner scanner = new Scanner(System.in);
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
    protected void onContinueButtonClicked(ActionEvent actionEvent) throws IOException, AgeRequirementException {
        String name = nameTextLabel.getText();
        String email = emailTextField.getText();
        String birthday = dobTextField.getText();
        String password = passwordTextField.getText();
        String address = addressTextField.getText();
        String ssnText = ssnTextField.getText();
        String checkingsAmountText = checkingsTextField.getText();
        String savingsAmountText = savingsTextField.getText();
        String accType = accTypeTextField.getText();
        //only accept int
        //int ssn = Integer.parseInt(ssnTextField.getText());
         double checkingsAmount;
         double savingsAmount;
         checkingsAmount = Double.parseDouble(checkingsAmountText);
         savingsAmount = Double.parseDouble(savingsAmountText);
        int TempSsn;
        int ssn = 0;
        TempSsn = Integer.parseInt(ssnText);

        if (ssnText.length() != 4) {
            throw new IllegalArgumentException("Please only enter your last 4 digits of your SSN");
        }

        System.out.println("Valid SSN: " + TempSsn);

        users[count++] = new Checkings(name, email, password, address, birthday, ssn, accType,
                checkingsAmount);
        users[count++] = new Savings(name, email, password, address, birthday, ssn, accType, savingsAmount);

        users[count - 2].setSsn(TempSsn);
        users[count - 1].setSsn(TempSsn);

        System.out.println(users[count - 2].getSsn() + "\n" + users[count - 1].getSsn());

        //checking if fields are empty

        if (nameTextLabel.getText().isEmpty() || emailTextField.getText().isEmpty() || dobTextField.getText().isEmpty() || passwordTextField.getText().isEmpty() || addressTextField.getText().isEmpty() || ssnTextField.getText().isEmpty() || checkingsTextField.getText().isEmpty() || savingsTextField.getText().isEmpty() || accTypeTextField.getText().isEmpty()) {

            Parent errorWindowView = FXMLLoader.load(MainApplication.class.getResource("errorWindow-view.fxml"));
            Scene errorWindowViewScene = new Scene(errorWindowView);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(errorWindowViewScene);
            window.show();
        } else {


            Parent accCreatedView = FXMLLoader.load(MainApplication.class.getResource("accCreated-view.fxml"));
            Scene accCreatedViewScene = new Scene(accCreatedView);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(accCreatedViewScene);
            window.show();
        }


        if(!validateFields()){
            try{
                Parent errorWindowView = FXMLLoader.load(MainApplication.class.getResource("errorWindow-view.fxml"));
                Scene errorWindowViewScene = new Scene(errorWindowView);
                Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                window.setScene(errorWindowViewScene);
            } catch (Exception e){
                e.printStackTrace();
            }
        } else{
            CreateAccController.setAll(users, name, email, birthday, password, address, ssn, checkingsAmount, savingsAmount, accType);
            Parent accCreatedView = FXMLLoader.load(MainApplication.class.getResource("accCreated-view.fxml"));
            Scene accCreatedViewScene = new Scene(accCreatedView);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(accCreatedViewScene);
            window.show();
            System.out.println(users[count - 2].toString());
            System.out.println(users[count - 1].toString());
        }

    }
    private boolean validateFields () {
            if (nameTextLabel.getText().isBlank()) {
                throw new IllegalArgumentException("Please make sure the Name field isn't left blank");

            }
            if (emailTextField.getText().isBlank()) {
                throw new IllegalArgumentException("Please make sure the Email field isn't left blank");
            }
            if (dobTextField.getText().isBlank()) {
                throw new IllegalArgumentException("Please make sure the Date of Birth field isn't left blank");
            }
            if (passwordTextField.getText().isBlank()) {
                throw new IllegalArgumentException("Please make sure the Password field isn't left blank");
            }
            if (addressTextField.getText().isBlank()) {
                throw new IllegalArgumentException("Please make sure the Address field isn't left blank");
            }
            try {
                if (ssnTextField.getText().length() != 4) {
                    throw new IllegalArgumentException("Please enter your last 4 digits of your SSN");
                }
            } catch (NumberFormatException ex) {
            System.out.println("ERROR: Please only enter integers" + ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;

    }

        //Error message
        /*
        String message = null;
        private void errorWindow(String message){
            ErrorWindowController.setErrorMessage(null);
            Parent errorWindowView = FXMLLoader.load(MainApplication.class.getResource("errorWindow-view.fxml"));
            Scene errorWindowViewScene = new Scene(errorWindowView);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(errorWindowViewScene);
            window.show();

        }
*/

        //TEST
        /*
        Checkings test1 = new Checkings(name, email, password, address, birthday, ssn, accType,
                checkingsAmount);
        Savings test2 = new Savings(name, email, password, address, birthday, ssn, accType, savingsAmount);
        System.out.println (test1.toString());
        System.out.println (test2.toString());
    */


    //onBackButtonClickedButton
    @FXML
    protected void onBackButtonClickedButton(ActionEvent actionEvent) throws IOException {
        Parent mainView =  FXMLLoader.load(MainApplication.class.getResource("main-view.fxml"));
        Scene mainViewScene = new Scene(mainView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainViewScene);
        window.show();

    }

    /*
    public void errorMessages(String error){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("errorWindow-view.fxml"));
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
    }
    */


    public static String setAll(BankSystem[] users, String name, String email, String birthday, String password, String address, int ssn, double checkingsAmount, double savingsAmount, String accType) throws AgeRequirementException {
//        users[count++] = new Checkings(name, email, password, address, birthday, ssn, accType,
//                checkingsAmount);
//        users[count++] = new Savings(name, email, password, address, birthday, ssn, accType, savingsAmount);
    String message;

        users[count - 2].setName(name);
        users[count - 1].setName(name);

        users[count - 2].setEmail(email);
        users[count - 1].setEmail(email);

        //exceptions (must be 18 or older)

            if(CreateAccController.age(birthday)<18){
                throw new AgeRequirementException("Error: You must be 18 or older to create an account");
            } else{
                users[count - 2].setBirthday(birthday);
                users[count - 1].setBirthday(birthday);
            }
            /*
        if(CreateAccController.age(birthday)<18){
            System.out.println ("You must be 18 or older to create an account");

        }else{
            users[count - 2].setBirthday(birthday);
            users[count - 1].setBirthday(birthday);
        }
             */
        users[count - 2].setPassword(password);
        users[count - 1].setPassword(password);

        users[count - 2].setAddress(address);
        users[count - 1].setAddress(address);
        //exception (4 digits only and must be INT)


        users[count - 2].setSsn(ssn);
        users[count - 1].setSsn(ssn);

        /*
        boolean invalidSsn = false, validSsn = false;
        while (invalidSsn){
            try {
            if (ssn != users[count - 2].getSsn() && ssn != users[count - 1].getSsn()) {
                throw new InvalidSSNFormatException("Error: Please only provide your 4 last digits of your SSN") {

                } catch (InvalidSSNFormatException Object invalidSSN) {
                System.out.println (invalidSsn);
                return;

                }
            }
                validSsn = true;
                users[count - 2].setSsn(ssn);
                users[count - 1].setSsn(ssn);



            }
        }
*/
        //exception (must be double)
        ((Checkings) users[count - 2]).setCheckingsAmount(checkingsAmount);
        ((Savings) users[count - 1]).setSavingsAmount(savingsAmount);
        //exception: "Student", "Business", "Regular" only /String
        users[count - 2].setAccType(accType);
        users[count - 1].setAccType(accType);




        Checkings test1 = new Checkings(name, email, password, address, birthday, ssn, accType,
                checkingsAmount);
        Savings test2 = new Savings(name, email, password, address, birthday, ssn, accType, savingsAmount);

        message = test1.toString() + "\n" + test2.toString();
        System.out.println ();
        return message;

    }



    //current date set to 12/30/24
    //subtring birthday for month, day, and year
    public static int age(String birthday) { //age calculation
        int YEAR = 2024;
        int MONTH =12;
        //calculate age
        String stringYear = birthday.substring(6, 10);
        String stringMonth = birthday.substring (0,2);
        int intYear = Integer.parseInt(stringYear);
//        int intMonth = Integer.parseInt(stringMonth);


        System.out.println (intYear);
        return YEAR - intYear;
//        System.out.println (intMonth);

//        if(YEAR - intYear <= 18){
//            System.out.println ("User is not old enough. Must be 18 or older to create an account");
//
//        }


        }

    }

    /*
      public static boolean acceptableBirthday(String birthday) {
    boolean decision;
    // Seperate the String into sections
    String stringYear = birthday.substring(6, 10);
    // String stringMonth = birthday.substring (1,3);

    // Convert String to int for comparison
    int intYear = Integer.parseInt(stringYear);
    // int intMonth = Integer.parseInt(stringMonth);

    // Make decision
    if ((YEAR - intYear) >= 18 && (YEAR - intYear) < 110) // FIX and make realistic for month
      decision = true;
    else
      decision = false;

    return decision;
  }

  public static int age(String birthday) {
    int limit = 100;
    String stringYear = birthday.substring(6, 10);
    int intYear = Integer.parseInt(stringYear);
    int age = 0;

    if ((YEAR - intYear) >= 18 && (YEAR - intYear) <= limit)
      age = YEAR - intYear;

    return age;
  }




     */






