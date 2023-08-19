package com.example.mysql_studentms_youtube_intellij;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CinemaApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CinemaApplication.class.getResource("home_page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 550);
        stage.setTitle("Welcome Page");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch(); }
}