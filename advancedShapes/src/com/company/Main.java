package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
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

        //scene
        Scene scene = new Scene(root,500,500);

        //cubic curve creation
        CubicCurve cubicCurve = new CubicCurve(50,250,125,50,175,450,250,250);
        cubicCurve.setStroke(new Color(0.1,1,0.5,1));
        cubicCurve.setStrokeWidth(5);
        cubicCurve.fillProperty().set(new Color(0.1,0.7,1,0.7));

        //adding cubicCurve to root
        root.getChildren().add(cubicCurve);

        //stage
        stage.setScene(scene);
        stage.setTitle("Advanced shapes");
        stage.show();
    }
}
