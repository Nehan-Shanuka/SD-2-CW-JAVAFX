package com.example.mysql_studentms_youtube_intellij;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class DetailController extends HomeController implements Initializable {

    private String new_word = "";
    private List<Ticket> newList;

    DataListManager dataArray = DataListManager.getInstance();

    @FXML
    private TextArea mytextarea;

    //Get and store the ticket data form DataListManager
    @FXML
    public String show(){

        int ticket_num;
        newList = dataArray.getDataList();

        for (int i = 0; i < newList.size(); i++) {
            String name = newList.get(i).Person.getName() + " " + newList.get(i).Person.getSurname();
            String email = newList.get(i).Person.getEmail();
            String row = String.valueOf(newList.get(i).getRow());
            String seat = String.valueOf(newList.get(i).getSeat());

            ticket_num = i+1;

            new_word = new_word + "Ticket No  :  " + ticket_num + "\n\t" + name + "\n\t" + email + "\n\t" + "row : " + row + "  /  " + "seat : " + seat + "\n\n";

        }
        return new_word;
    }

    //Print the ticket data in the text area
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        new_word = show();
        mytextarea.setText(new_word);
    }
}
