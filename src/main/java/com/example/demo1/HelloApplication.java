package com.example.demo1;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage myStage) throws IOException {

        //PASTE YOUR CODE HERE

        myStage.setTitle("Hello!");
        myStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}