package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	// write your code here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //stage title
        stage.setTitle("Drawing lines");
        //container creation
        Group root = new Group();
        //scene creation and container passing and size, color setting
        Scene scene = new Scene(root,300,300, Color.GRAY);
        //creating a line
        Line redLine1 = new Line(10,100,200,100);
        //setting color
        redLine1.setStroke(Color.BLUE);
        //setting width
        redLine1.setStrokeWidth(5);
        //adding line to container
        root.getChildren().add(redLine1);
        //creating a line
        Line redLine2 = new Line(10,120,200,120);
        //setting color
        redLine2.setStroke(Color.RED);
        //setting width
        redLine2.setStrokeWidth(5);
        //dash
        redLine2.getStrokeDashArray().addAll(20d,10d);
        //dash offset set
        redLine2.setStrokeDashOffset(0);
        //adding to container
        root.getChildren().add(redLine2);
        //setting scene to the stage
        stage.setScene(scene);
        //show stage
        stage.show();
    }
}
