package com.example.mysql_studentms_youtube_intellij;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookController extends TicketController {


    int[] row1 = new int[12];
    int[] row2 = new int[16];
    int[] row3 = new int[20];

    @FXML
    private TextField myTextFiled;
    @FXML
    private RadioButton radio1, radio2, radio3;
    @FXML
    private Label infoText;

    Data data = Data.getInstance();

    DataListManager dataArray = DataListManager.getInstance();

    @FXML
    public void bookTicket() {
        getTextFile();
        getSeatInfo();
    }

    //Load the text file that contains reserved seat info
    protected void getTextFile(){

        try {
            File fileObj = new File("seatinfo.txt");
            Scanner fileReader = new Scanner(fileObj);

            //when reading the "seatinfo.txt" line by line it takes what line is it
            int while_count = 1;

            while (fileReader.hasNextLine()) {
                if (while_count == 1) {
                    String saved_line1 = fileReader.nextLine();
                    //reassigning row_1 values according to previously saved
                    for (int i = 0; i < saved_line1.length(); i++) {
                        row1[i] = Integer.parseInt(String.valueOf(saved_line1.charAt(i)));
                    }
                } else if (while_count == 2) {
                    String saved_line2 = fileReader.nextLine();
                    for (int i = 0; i < saved_line2.length(); i++) {
                        row2[i] = Integer.parseInt(String.valueOf(saved_line2.charAt(i)));
                    }
                } else if (while_count == 3) {
                    String saved_line3 = fileReader.nextLine();
                    for (int i = 0; i < saved_line3.length(); i++) {
                        row3[i] = Integer.parseInt(String.valueOf(saved_line3.charAt(i)));
                    }
                }
                while_count++;
            }
            fileReader.close();

            System.out.println();
            System.out.format("%55s", "***** Successfully Loaded into the System! *****\n");

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Getting the row and seat number to complete the ticket
    @FXML
    protected void getSeatInfo() {

        firstName = data.getFirstName();
        secondName = data.getSecondName();
        email = data.getEmail();

        int seat = Integer.parseInt(myTextFiled.getText());

        if (radio1.isSelected()) {

            insertData(firstName, secondName, email, 1, seat, radio1, 1, 12, row1);
//            String row = radio1.getText();
//            int seat = Integer.parseInt(myTextFiled.getText());
//            row1[seat-1] = 1;
//            infoText.setText("You Successfully Reserved " + row + " : SEAT " + seat);
//
//            myTicket = new Ticket(firstName.toUpperCase(), secondName.toUpperCase(), email.toLowerCase(), 1, seat);
        }
        else if (radio2.isSelected()) {

            insertData(firstName, secondName, email, 2, seat, radio2, 1, 16, row2);
//            String row = radio2.getText();
//            row2[seat-1] = 1;
//            infoText.setText("You Successfully Reserved " + row + " : SEAT " + seat);
//
//            myTicket = new Ticket(firstName.toUpperCase(), secondName.toUpperCase(), email.toLowerCase(), 2, seat);
        }
        else if (radio3.isSelected()) {

            insertData(firstName, secondName, email, 3, seat, radio3, 1, 20, row3);
//            String row = radio3.getText();
//            row3[seat-1] = 1;
//            infoText.setText("You Successfully Reserved " + row + " : SEAT " + seat);
//
//            myTicket = new Ticket(firstName.toUpperCase(), secondName.toUpperCase(), email.toLowerCase(), 3, seat);
        }

    }

    protected void insertData(String firstName, String secondName, String email, int row_num, int seat_num,
                              RadioButton radioBtn, int firstSeatNum, int lastSeatNum,
                              int[] rowArray){

        String row = radioBtn.getText();

        if (seat_num >= firstSeatNum && seat_num <= lastSeatNum && rowArray[seat_num-1] == 0){
            rowArray[seat_num-1] = 1;
            infoText.setTextFill(Color.rgb(10, 168, 52));
            infoText.setText("You Successfully Reserved " + row + " : SEAT " + seat_num);

            myTicket = new Ticket(firstName.toUpperCase(), secondName.toUpperCase(), email.toLowerCase(), row_num, seat_num);

            dataArray.addData(myTicket);
            save();
        }
        else {
            infoText.setTextFill(Color.RED);
            infoText.setText("Seat selection can not be proceed! Check the seating area and try again!");
        }

    }

    //Save the reserved seat data to text file again
    protected void save() {

        try {
            FileWriter myWriter = new FileWriter("seatinfo.txt");
            //to write a new line
            String newline = System.getProperty("line.separator");
            //https://www.geeksforgeeks.org/java-program-to-print-a-new-line-in-string/

            for (int item : row1) {
                myWriter.write(String.valueOf(item));
            }
            myWriter.write(newline);

            for (int item : row2) {
                myWriter.write(String.valueOf(item));
            }
            myWriter.write(newline);

            for (int item : row3) {
                myWriter.write(String.valueOf(item));
            }
            myWriter.close();

            System.out.println();
            System.out.format("%39s", "Successfully Saved!");
            System.out.println();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
