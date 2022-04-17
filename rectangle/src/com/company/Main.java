package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	// write your code here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,500,500, Color.GRAY);
        stage.setTitle("Rectangle");


        //creating a rectangle
        Rectangle rectangle1 = new Rectangle(200,100,50,50);
        //setting color
        rectangle1.setFill(Color.rgb(100,200,70));
        //adding to the container
        root.getChildren().add(rectangle1);

        //creating a rectangle
        Rectangle rectangle2 = new Rectangle();
        //position
        rectangle2.setX(200);
        rectangle2.setY(200);
        //width
        rectangle2.setWidth(50);
        //height
        rectangle2.setHeight(50);
        //setting color
        rectangle2.setFill(new Color(0.4,0.2,0.5,1));
        //stroke width
        rectangle2.setStrokeWidth(5);
        //stroke color
        rectangle2.setStroke(Color.RED);
        //adding to the container
        root.getChildren().add(rectangle2);


        stage.setScene(scene);
        stage.show();
    }
}
