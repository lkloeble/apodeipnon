package org.orthodoxmusic.apodeipnon;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.SVGPath;
import javafx.stage.Stage;


public class HelloWorldApplication extends Application implements EventHandler<KeyEvent>{

    Canvas canvas = new Canvas(800,600);
    Group group = new Group(canvas);
    Scene scene = new Scene(group);
    Stage globalStage;

    private int lastXIsonCoordonate = -250;

    public static void main(String[] args) {
        System.out.println("on passe par main avec " + args.length + " arguments");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        scene.setOnKeyPressed(this);
        stage.setScene(scene);
        stage.setTitle("Apodeipnon Application");
        System.out.println("on peut logger ");
        globalStage = stage;
        stage.show();
    }

    @Override
    public void handle(KeyEvent e)
    {
        // Get the Type of the Event
        String type = e.getEventType().getName();
        // Get the KeyCode of the Event
        KeyCode keyCode = e.getCode();
        System.out.println("keyevent " + type + " " + keyCode);
        if(keyCode.getName().equals("I")) {
            drawIson();
        }
    }

    public void drawIson() {
        System.out.println("drawIson");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M390 199 c-229 -10 -314 -30 -340 -78 -24 -46 0 -82 41 -61 23 13 24 26 4 34 -27 10 -16 37 21 52 30 13 68 14 223 8 182 -6 187 -6 214 16 28 23 36 41 15 38 -7 0 -87 -5 -178 -9z");
        svgPath.setScaleX(0.1);
        svgPath.setScaleY(0.1);
        svgPath.setTranslateX(lastXIsonCoordonate);
        lastXIsonCoordonate += 80;
        group.getChildren().addAll(svgPath);
    }


}
