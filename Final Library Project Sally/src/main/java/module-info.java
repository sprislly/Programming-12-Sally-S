module com.example.finallibraryprojectsally {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finallibraryprojectsally to javafx.fxml;
    exports com.example.finallibraryprojectsally;
}