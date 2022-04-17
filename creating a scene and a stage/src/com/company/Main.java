package com.company;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
	// write your code here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //creating a container
        Group root = new Group();
        //creating a scene
        Scene scene = new Scene(root,500,500, Color.GRAY);
        //set scene to the stage
        stage.setScene(scene);
        //setting title
        stage.setTitle("Hello World");
        //
        stage.show();
    }
}
