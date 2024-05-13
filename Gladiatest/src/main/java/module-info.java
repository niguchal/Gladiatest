module com.example.gladiatest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.gladiatest to javafx.fxml;
    exports com.example.gladiatest;
}