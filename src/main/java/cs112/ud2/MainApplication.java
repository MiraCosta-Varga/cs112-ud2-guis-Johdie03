package cs112.ud2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 500);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();


        //FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        // Scene scene = new Scene(fxmlLoader.load(), 700, 465);
         //FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("createAcc-view.fxml"));
         //Scene scene = new Scene(fxmlLoader.load(), 600, 400);
    }

    public static void main(String[] args) {
        launch();
    }
}