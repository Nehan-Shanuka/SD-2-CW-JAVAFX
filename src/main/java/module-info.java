module com.example.mysql_studentms_youtube_intellij {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mysql_studentms_youtube_intellij to javafx.fxml;
    exports com.example.mysql_studentms_youtube_intellij;
}