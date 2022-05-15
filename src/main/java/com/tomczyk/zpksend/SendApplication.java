package com.tomczyk.zpksend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SendApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SendApplication.class.getResource("zpk-wysylka-pomiarow.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Aplikacja do wysyłki pomiarów");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}