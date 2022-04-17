package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        // write your code here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //container
        Group root = new Group();
        //Scene
        Scene scene = new Scene(root,500,500);

        Stop stop1 = new Stop(0.0, Color.BLUE);
        Stop stop2 = new Stop(1,Color.RED);
        Stop[] stops = {stop1,stop2};
        LinearGradient linearGradient = new LinearGradient(1,1,0,0,true, CycleMethod.NO_CYCLE,stops);

        Rectangle rectangle = new Rectangle(200,100,100,100);
        rectangle.setStrokeWidth(5);
        rectangle.setFill(linearGradient);


        root.getChildren().add(rectangle);
        //stage
        stage.setTitle("Path");
        stage.setScene(scene);
        stage.show();
    }
}

