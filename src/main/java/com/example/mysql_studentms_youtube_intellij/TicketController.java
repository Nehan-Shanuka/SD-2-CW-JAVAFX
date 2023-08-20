package com.example.mysql_studentms_youtube_intellij;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TicketController extends HomeController {

    @FXML
    protected TextField firstNameText, secondNameText, emailText;

    Data data = Data.getInstance();

    //Submit the ticket details into the book scene
    @FXML
    protected void getTicketInfo(ActionEvent event) throws IOException {

        if (firstNameText.getText().isEmpty() || secondNameText.getText().isEmpty()
                || emailText.getText().isEmpty()){

            onTicketButtonClick(event);
        }
        else {

            data.setFirstName(firstNameText.getText());
            data.setSecondName(secondNameText.getText());
            data.setEmail(emailText.getText());

            //Open book scene
            onBookButtonClick(event);
        }

    }



}
