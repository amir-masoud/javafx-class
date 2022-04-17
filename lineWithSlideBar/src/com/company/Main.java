package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Slider;

public class Main extends Application {

    public static void main(String[] args) {
	// write your code here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,500,500);
        stage.setTitle("Working with slide bar");

        //red line creation & styling
        Line redLine = new Line(100,200,350,200);
        redLine.setStroke(Color.RED);
        redLine.setStrokeWidth(5);

        //red line dashing
        redLine.getStrokeDashArray().addAll(10d,10d);
        redLine.setStrokeDashOffset(5);

        //red line adding to the root
        root.getChildren().add(redLine);

        //slider creation
        Slider slider = new Slider(0,100,0);
        //slider position
        slider.setLayoutX(100);
        slider.setLayoutY(250);

        //binding line to the slider
        redLine.strokeDashOffsetProperty().bind(slider.valueProperty());
        //adding slider to root
        root.getChildren().add(slider);

        //creating a text
        Text dashOffsetText = new Text("Dash offset is : " + slider.getValue());
        //text position
        dashOffsetText.setX(100);
        dashOffsetText.setY(300);
        //text color
        dashOffsetText.setStroke(Color.BLUE);
        //text style
        dashOffsetText.setStyle("-fx-font-size: 16");

        //adding text to root
        root.getChildren().add(dashOffsetText);

        //display dash offset value
        slider.valueProperty()
                .addListener((ov ,olVal,newVal)->
                        dashOffsetText.setText("Dash offset is : " + newVal));
        //
        stage.setScene(scene);
        stage.show();
    }
}
