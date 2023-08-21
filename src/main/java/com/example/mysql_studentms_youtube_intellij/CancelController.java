package com.example.mysql_studentms_youtube_intellij;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Objects;

public class CancelController extends BookController {

    @FXML
    private TextField rowInput, seatInput, emailText;

    @FXML
    private Label noticeLabel;

    List<Ticket> newList;
    DataListManager dataList = DataListManager.getInstance();

    @FXML
    protected void cancelTicketBySeat(){

        getTextFile();

        newList = dataList.getDataList();
        int row = Integer.parseInt(rowInput.getText());
        int seat = Integer.parseInt(seatInput.getText());

        try {
            newList.removeIf(newTicket -> Objects.equals(row, newTicket.getRow()) && Objects.equals(seat, newTicket.getSeat()));
            dataList.replaceDataList(newList);
        } catch (ConcurrentModificationException ignored){}

        cancelSeatFromSeatingArea(row, seat);

    }

    @FXML
    protected void cancelTicketByEmail(){

        getTextFile();

        newList = dataList.getDataList();
        String email = emailText.getText();

        try {
            for (Ticket newTicket : newList) {
                if (Objects.equals(email, newTicket.Person.getEmail())) {
                    newList.remove(newTicket);

                    cancelSeatFromSeatingArea(newTicket.getRow(), newTicket.getSeat());
                }
            }
            dataList.replaceDataList(newList);
        }
        catch (ConcurrentModificationException ignored){}
    }

    @FXML
    protected void cancelAllTickets(){

        newList = dataList.getDataList();

        row1 = new int[12];
        row2 = new int[16];
        row3 = new int[20];

        save();

        newList.clear();
        dataList.replaceDataList(newList);
    }

    protected void cancelSeatFromSeatingArea(int row_num, int seat_num){

        if (row_num == 1){
            row1[seat_num-1] = 0;
        }
        else if (row_num == 2) {
            row2[seat_num-1] = 0;
        }
        else if (row_num == 3) {
            row3[seat_num-1] = 0;
        }

        save();
    }
}
