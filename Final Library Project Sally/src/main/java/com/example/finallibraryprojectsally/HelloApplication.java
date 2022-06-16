package com.example.finallibraryprojectsally;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sally's Library.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 363);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

/*
make the gridder to rotate to the right
files and database
bfs
wathc the vids set up the gui so I can code the buttons
set up the different windows
code the buttons, to move between different windows
code the user database, be able to add to the database and check for the user
code the buttons to save that
code the book list
code the buttons to be able to put book in the cart and to look at the book
code the cart to check out the book, put the book in a list of checked out books in the user profile
 */