package com.company;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
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
        //container
        Group root = new Group();

        //scene
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);

        //rec creation
        Rectangle rec1 = new Rectangle();
        rec1.setX(100);
        rec1.setY(100);
        rec1.setWidth(100);
        rec1.setHeight(100);
        rec1.setStrokeWidth(5);
        rec1.setStroke(Color.RED);
        rec1.fillProperty().set(Color.BLUE);

        //adding rec to the root
        root.getChildren().add(rec1);

        //key type
        scene.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                //decision on key
                switch (keyEvent.getCharacter()){
                    //'w' is for up
                    case "w":
                        //checking
                        if(rec1.getY()-5>0)
                            //going up -5 the height
                            rec1.setY(rec1.getY()-5);
                        break;
                    case "a":
                        if(rec1.getX()-5>0)
                            rec1.setX(rec1.getX()-5);
                        break;
                    case "s":
                        if(rec1.getY()+ rec1.getHeight()+5<500)
                            rec1.setY(rec1.getY()+5);
                        break;
                    case "d":
                        if (rec1.getX()+ rec1.getWidth()+5<500)
                            rec1.setX(rec1.getX()+5);
                        break;
                    default:
                        System.out.println("invalid key is typed");
                }
            }
        });

        //stage
        stage.setTitle("Rectangles");
        stage.show();
    }
}
