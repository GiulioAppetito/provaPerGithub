module com.example.provapergithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.provapergithub to javafx.fxml;
    exports com.example.provapergithub;
}