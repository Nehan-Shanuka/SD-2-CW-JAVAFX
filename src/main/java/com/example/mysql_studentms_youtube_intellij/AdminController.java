package com.example.mysql_studentms_youtube_intellij;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Objects;

public class AdminController extends HomeController {

    private String username, password;

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label massageLabel;

    @FXML
    private void takePassword(ActionEvent event) throws IOException {

        username = usernameField.getText();
        password = passwordField.getText();

        if (Objects.equals(username, "admin") && Objects.equals(password, "111111")) {
            onDetailButtonClick(event);
        }
        else {
            massageLabel.setText("Username & Password does not match!\nPlease enter valid credentials.");
        }
    }
}
