package com.example.mysql_studentms_youtube_intellij;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

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

        if ((row == 1 && row1[seat-1] == 1) || (row == 2 && row2[seat-1] == 1) || (row == 3 && row3[seat-1] == 1)){
            try {
                newList.removeIf(newTicket -> Objects.equals(row, newTicket.getRow()) && Objects.equals(seat, newTicket.getSeat()));
                dataList.replaceDataList(newList);


                noticeLabel.setTextFill(Color.rgb(10, 168, 52));
                noticeLabel.setText("ROW : " + row + " / SEAT : " + seat + " CANCELED SUCCESSFULLY!");

            } catch (ConcurrentModificationException ignored){}

            cancelSeatFromSeatingArea(row, seat);
        } else {
            noticeLabel.setTextFill(Color.RED);
            noticeLabel.setText("SORRY! YOUR REQUEST CAN NOT BE PROCEED.\n" + "ROW : " + row + " / SEAT : " + seat + " IS STILL AVAIALBLE TO PURCHASE!");
        }

    }

    @FXML
    protected void cancelTicketByEmail(){

        getTextFile();

        newList = dataList.getDataList();
        String email = emailText.getText();

        boolean massageSignal = false;

        try {
            for (int i = newList.size()-1 ; i >= 0; i--) {
                if (Objects.equals(email, newList.get(i).Person.getEmail())) {

                    cancelSeatFromSeatingArea(newList.get(i).getRow(), newList.get(i).getSeat());
                    newList.remove(i);

                    massageSignal = true;
                }
            }
            dataList.replaceDataList(newList);
        }
        catch (ConcurrentModificationException ignored){}

        if (massageSignal){

            noticeLabel.setTextFill(Color.rgb(10, 168, 52));
            noticeLabel.setText("ALL THE SEATS PURCHASED BY \"" + email + "\" CANCELED SUCCESSFULLY!");
        }
        else {

            noticeLabel.setTextFill(Color.RED);
            noticeLabel.setText("SORRY! THERE IS NO PURCHASED SEATS UNDER \"" + email + "\" .");
        }
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

        noticeLabel.setTextFill(Color.rgb(10, 168, 52));
        noticeLabel.setText("ALL THE RESERVED TICKETS ARE CANCELED!\nEVERY SEATS READY TO PURCHASE FOR THE SCREEN!");
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
