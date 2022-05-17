module com.example.guiintro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guiintro to javafx.fxml;
    exports com.example.guiintro;
}