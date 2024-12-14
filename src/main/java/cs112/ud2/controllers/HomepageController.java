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
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.ud2.controllers.CreateAccController.count;
import static cs112.ud2.controllers.CreateAccController.users;

public class HomepageController {
    @FXML
    private Button depositButton;

    @FXML
    private Button withdrawButton;

    @FXML
    private Button transferButton;


    @FXML
    protected void onDepositButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent depositMoneyView =  FXMLLoader.load(MainApplication.class.getResource("depositMoney-view.fxml"));
        Scene depositMoneyViewScene = new Scene(depositMoneyView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(depositMoneyViewScene);
        window.show();

    }

    @FXML
    protected void onWithdrawButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent withdrawMoneyView =  FXMLLoader.load(MainApplication.class.getResource("withdrawMoney-view.fxml"));
        Scene withdrawMoneyViewScene = new Scene(withdrawMoneyView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(withdrawMoneyViewScene);
        window.show();

    }

    @FXML
    protected void onTransferButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent transferMoneyView =  FXMLLoader.load(MainApplication.class.getResource("transferMoney-view.fxml"));
        Scene transferMoneyViewScene = new Scene(transferMoneyView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(transferMoneyViewScene);
        window.show();

    }

    //onViewAccDetailsButtonClicked
    @FXML
    protected void onViewAccDetailsButtonClicked(ActionEvent actionEvent) throws IOException {
        //Parent viewAccDetailsView =  FXMLLoader.load(MainApplication.class.getResource("viewAccDetails-view.fxml"));
        FXMLLoader loader= new FXMLLoader(MainApplication.class.getResource("viewAccDetails-view.fxml"));
        Parent viewAccDetailsView = loader.load();
        ViewAccDetailsController controller = loader.getController();
        controller.displayAccDetails(((Checkings)users[count-2]).getName(), ((Checkings)users[count-2]).getAccType(), ((Checkings) users[count - 2]).getTotalCheckingsAmount(), ((Savings)users[count-1]).getTotalSavingsAmount());

        Scene viewAccDetailsViewScene = new Scene(viewAccDetailsView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(viewAccDetailsViewScene);
        window.show();



    }




}
