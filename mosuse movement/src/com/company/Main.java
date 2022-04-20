package com.company;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    public static void main(String[] args) {
	// write your code here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,500,500);

        //the rectangle is created to show and clarify the mouse movement outcome
        Rectangle rectangle = new Rectangle(100,100,200,200);
        root.getChildren().add(rectangle);

        /*
            setOnMouseMoved method reacts with mouse movements
            the reaction that is implemented below is changing the scene color
            while you move your mouse cursor outside the drawn black rectangle, the color
            stays gray; if you move the mouse cursor inside it, the scene
            color changes to blue;
         */
        scene.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //inside of rectangle
                if ((event.getX() > 100 && event.getX() < 300) && (event.getY() > 100 && event.getY() < 300))
                    scene.setFill(Color.BLUE);
                //outside of rectangle
                if (event.getX() < 100 | event.getX() > 300 | event.getY() < 100 | event.getY() > 300)
                    scene.setFill(Color.GRAY);
            }
        });

        stage.setScene(scene);
        stage.setTitle("Mouse event");
        stage.show();
    }
}
