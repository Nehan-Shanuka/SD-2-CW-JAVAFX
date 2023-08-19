package com.example.mysql_studentms_youtube_intellij;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HallController extends BookController {

    @FXML
    private Circle circle1, circle2, circle3, circle4, circle5, circle6,
            circle7, circle8, circle9, circle10, circle11, circle12;
    @FXML
    private Circle circle2_1, circle2_2, circle2_3, circle2_4, circle2_5, circle2_6,
            circle2_7, circle2_8, circle2_9, circle2_10, circle2_11, circle2_12, circle2_13,
            circle2_14, circle2_15, circle2_16;
    @FXML
    private Circle circle3_1, circle3_2, circle3_3, circle3_4, circle3_5, circle3_6, circle3_7,
            circle3_8, circle3_9, circle3_10, circle3_11, circle3_12, circle3_13, circle3_14, circle3_15,
            circle3_16, circle3_17, circle3_18, circle3_19, circle3_20;

    @FXML
    public void showAvailabilities() {
        getTextFile();
        changeColor();
    }

    @FXML
    protected void changeColor() {
        int count = 0;

        for (int item : row1) {

            count++;

            if (item == 1 && count == 1) {
                circle1.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 2) {
                circle2.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 3) {
                circle3.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 4) {
                circle4.setFill(Color.web("ff1f1f"));
            }
            if (item == 1 && count == 5) {
                circle5.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 6) {
                circle6.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 7) {
                circle7.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 8) {
                circle8.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 9) {
                circle9.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 10) {
                circle10.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 11) {
                circle11.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 12) {
                circle12.setFill(Color.web("#ff1f1f"));
            }

        }
        count = 0;

        for (int item : row2) {

            count++;

            if (item == 1 && count == 1) {
                circle2_1.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 2) {
                circle2_2.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 3) {
                circle2_3.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 4) {
                circle2_4.setFill(Color.web("ff1f1f"));
            }
            if (item == 1 && count == 5) {
                circle2_5.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 6) {
                circle2_6.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 7) {
                circle2_7.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 8) {
                circle2_8.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 9) {
                circle2_9.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 10) {
                circle2_10.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 11) {
                circle2_11.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 12) {
                circle2_12.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 13) {
                circle2_13.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 14) {
                circle2_14.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 15) {
                circle2_15.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 16) {
                circle2_16.setFill(Color.web("#ff1f1f"));
            }

        }
        count = 0;

        for (int item : row3) {

            count++;

            if (item == 1 && count == 1) {
                circle3_1.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 2) {
                circle3_2.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 3) {
                circle3_3.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 4) {
                circle3_4.setFill(Color.web("ff1f1f"));
            }
            if (item == 1 && count == 5) {
                circle3_5.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 6) {
                circle3_6.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 7) {
                circle3_7.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 8) {
                circle3_8.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 9) {
                circle3_9.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 10) {
                circle3_10.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 11) {
                circle3_11.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 12) {
                circle3_12.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 13) {
                circle3_13.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 14) {
                circle3_14.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 15) {
                circle3_15.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 16) {
                circle3_16.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 17) {
                circle3_17.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 18) {
                circle3_18.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 19) {
                circle3_19.setFill(Color.web("#ff1f1f"));
            }
            if (item == 1 && count == 20) {
                circle3_20.setFill(Color.web("#ff1f1f"));
            }

        }
    }
}
