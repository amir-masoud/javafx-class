package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
        scene.setFill(Color.GRAY);

        //text creation
        Text text1 = new Text("welcome to javafx");
        //color
        text1.setStroke(Color.RED);
        text1.setFill(Color.RED);
        //position
        text1.setY(100);
        text1.setX(100);
        //font
        text1.setFont(new Font("Thoma",40));
        //effects
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(2.0f);
        dropShadow.setOffsetY(2.0f);
        dropShadow.setColor(Color.BLUE);
        text1.setEffect(dropShadow);
        //adding
        root.getChildren().add(text1);




        //stage
        stage.setTitle("texts");
        stage.setScene(scene);
        stage.show();
    }
}
