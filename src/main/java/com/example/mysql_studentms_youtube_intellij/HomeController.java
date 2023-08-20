package com.example.mysql_studentms_youtube_intellij;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HomeController {

    protected Ticket myTicket;

    ArrayList<Ticket> ticketList = new ArrayList<>();

    String firstName;
    String secondName;
    String email;
//
//    Calendar calendar;
//    SimpleDateFormat timeFormat;
//    String time;
//    String day;
//    String date;

    private Stage stage;
    private Scene scene;
    private Parent root;

//    @FXML
//    private Label welcomeText;
//
//    @FXML
//    private Label timeLabel;

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }

    //Home page scene
    @FXML
    protected void onHomeButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("home_page.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Welcome to New Theatre!");
        stage.setScene(scene);
        stage.show();

//        showTime(event);
    }

//    @FXML
//    protected void showTime(ActionEvent event) {
//        timeFormat = new SimpleDateFormat("hh:mm:ss a");
//        time = timeFormat.format(Calendar.getInstance().getTime());
//        System.out.println(time);
//
//        setTime();
//    }

//    public void setTime() {
//        while (true) {
//            time = timeFormat.format(Calendar.getInstance().getTime());
//            timeLabel.setText(time);
//
////            day = dayFormat.format(Calendar.getInstance().getTime());
////            dayLabel.setText(day);
////
////            date = dateFormat.format(Calendar.getInstance().getTime());
////            dateLabel.setText(date);
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//    }

    //Ticket page scene
    @FXML
    protected void onTicketButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ticket_page.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Ticket Info");
        stage.setScene(scene);
        stage.show();
    }

    //Book page scene
    @FXML
    protected void onBookButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("book_page.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Book Your Seat");
        stage.setScene(scene);
        stage.show();
    }

    //Seating area page scene
    @FXML
    protected void onShowButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hall_allocation.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Hall Allocation");
        stage.setScene(scene);
        stage.show();
    }

    //Ticket detail page scene
    @FXML
    protected void onDetailButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("detail_page.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Details");
        stage.setScene(scene);
        stage.show();
    }

    //Admin LogIn page scene
    @FXML
    protected void onAdminButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("admin_page.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Admin LogIn");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onAdminInterfaceClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("admin_interface.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Admin LogIn");
        stage.setScene(scene);
        stage.show();
    }
}