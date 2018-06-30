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
        if(keyCode.getName().equals("O")) {
            drawOligon();
        }
        if(keyCode.getName().equals("A")) {
            drawApostrophos();
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

    public void drawOligon() {
        System.out.println("drawOligon");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M334 180 c-220 -5 -244 -7 -263 -24 -12 -11 -21 -22 -21 -25 0 -3 110 -4 245 -1 236 5 245 6 267 27 12 12 20 24 17 25 -2 2 -113 1 -245 -2z");
        svgPath.setScaleX(0.1);
        svgPath.setScaleY(0.1);
        svgPath.setTranslateX(lastXIsonCoordonate);
        lastXIsonCoordonate += 80;
        group.getChildren().addAll(svgPath);
    }

    public void drawApostrophos() {
        System.out.println("drawApostrophos");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M157 183 c-4 -3 2 -12 13 -20 11 -8 20 -25 20 -39 0 -30 -44 -52 -121 -61 -52 -6 -68 -23 -21 -23 43 0 139 26 167 44 14 9 31 29 38 43 10 22 8 28 -12 44 -23 19 -71 26 -84 12z");
        svgPath.setScaleX(0.1);
        svgPath.setScaleY(0.1);
        svgPath.setTranslateX(lastXIsonCoordonate);
        lastXIsonCoordonate += 80;
        group.getChildren().addAll(svgPath);
    }


    //https://convertio.co/fr/png-converter/
}
