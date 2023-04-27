module com.example.clockgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clockgui to javafx.fxml;
    exports com.example.clockgui;
}