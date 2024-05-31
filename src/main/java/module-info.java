module com.example.codelabmodul6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codelabmodul6 to javafx.fxml;
    exports com.example.codelabmodul6;
}