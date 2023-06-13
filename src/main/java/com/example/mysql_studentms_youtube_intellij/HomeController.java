package com.example.mysql_studentms_youtube_intellij;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onShowButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hall_allocation.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Hall Allocation");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onHomeButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("home_page.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Welcome to New Theatre!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onBookButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("book_page.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Book Your Seat");
        stage.setScene(scene);
        stage.show();
    }
}