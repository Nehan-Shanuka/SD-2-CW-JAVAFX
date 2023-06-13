package com.example.mysql_studentms_youtube_intellij;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TicketController extends HomeController {

    int[] row1 = new int[12];
    int[] row2 = new int[16];
    int[] row3 = new int[20];

    @FXML
    protected TextField firstNameText, secondNameText, emailText;

    @FXML
    protected void getTicketInfo(ActionEvent event) throws IOException {
        firstName = firstNameText.getText();
        secondName = secondNameText.getText();
        email = emailText.getText();

        onBookButtonClick(event);
    }



}
