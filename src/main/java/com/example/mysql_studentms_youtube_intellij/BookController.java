package com.example.mysql_studentms_youtube_intellij;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookController extends HomeController {

    @FXML
    private TextField myTextFiled;
    @FXML
    private RadioButton radio1, radio2, radio3;

    int[] row1 = new int[12];
    int[] row2 = new int[16];
    int[] row3 = new int[20];

    @FXML
    public void load(ActionEvent event) {
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

        getSeatInfo(event);

        save();
    }

    @FXML
    protected void getSeatInfo(ActionEvent event) {

        if (radio1.isSelected()) {
            int seat = Integer.parseInt(myTextFiled.getText());
            row1[seat-1] = 1;
            System.out.println(row1[seat]);
        }
        if (radio2.isSelected()) {
            int seat = Integer.parseInt(myTextFiled.getText());
            row2[seat-1] = 1;
        }
        if (radio3.isSelected()) {
            int seat = Integer.parseInt(myTextFiled.getText());
            row3[seat-1] = 1;
        }
    }

    protected void save() {

        try {
            FileWriter myWriter = new FileWriter("seatinfo.txt");
            //to write a new line
            String newline = System.getProperty("line.separator");
            //https://www.geeksforgeeks.org/java-program-to-print-a-new-line-in-string/

            System.out.println(row1[9]);

            for (int i = 0; i<row1.length; i++) {
                myWriter.write(String.valueOf(row1[i]));
            }
            myWriter.write(newline);

            for (int i = 0; i<row2.length; i++) {
                myWriter.write(String.valueOf(row2[i]));
            }
            myWriter.write(newline);

            for (int i = 0; i<row3.length; i++) {
                myWriter.write(String.valueOf(row3[i]));
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
