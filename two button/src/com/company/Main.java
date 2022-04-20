package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	// write your code here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //container and scene
        Group root = new Group();
        Scene scene = new Scene(root,500,500);
        stage.setTitle("buttons");

        //creating the first button(saveButton)
        Button saveButton = new Button("save");
        saveButton.setLayoutX(220);
        saveButton.setLayoutY(220);
        root.getChildren().add(saveButton);
        //saveButton setOnAction
        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("save");
            }
        });

        //creating second button(cancelButton)
        Button cancelButton = new Button("cancel");
        cancelButton.setLayoutX(220);
        cancelButton.setLayoutY(250);
        root.getChildren().add(cancelButton);

        //cancelButton setOnAction

        //creating an object from a class which implements EventHandler
        CancelButtonHandler cancelButtonHandler = new CancelButtonHandler();
        //passing the object to the setOnAction function
        cancelButton.setOnAction(cancelButtonHandler);

        stage.setScene(scene);
        stage.show();
    }

    //A class which implements EventHandler
    class CancelButtonHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent actionEvent) {
            System.out.println("cancel");
        }
    }
}
