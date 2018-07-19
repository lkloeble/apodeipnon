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
        if(keyCode.getName().equals("E")) {
            drawElafron();
        }
        if(keyCode.getName().equals("P")) {
            drawPetastie();
        }
        if(keyCode.getName().equals("K")) {
            drawKendimata();
        }
    }

    private void drawKendimata() {
        System.out.println("drawKendimata");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M65 80 c-14 -22 -25 -42 -25 -45 0 -3 13 -5 30 -5 24 0 33 7 50 40 25 49 25 50 -5 50 -18 0 -32 -11 -50 -40z M173 85 c-9 -19 -20 -35 -25 -35 -4 0 -8 -4 -8 -10 0 -12 50 -13 66 -2 11 7 44 65 44 77 0 3 -14 5 -30 5 -25 0 -33 -6 -47 -35z");
        svgPath.setScaleX(0.1);
        svgPath.setScaleY(0.1);
        svgPath.setTranslateX(lastXIsonCoordonate);
        lastXIsonCoordonate += 80;
        group.getChildren().addAll(svgPath);
    }

    private void drawPetastie() {
        System.out.println("drawPetastie");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M247 200 c-61 -24 -197 -101 -197 -112 0 -4 28 -8 62 -8 54 0 60 2 43 14 -28 21 -13 41 61 77 113 56 214 41 214 -31 0 -30 -13 -45 -45 -53 -13 -3 -9 -5 12 -6 68 -2 105 34 88 88 -16 51 -144 68 -238 31z");
        svgPath.setScaleX(0.1);
        svgPath.setScaleY(0.1);
        svgPath.setTranslateX(lastXIsonCoordonate);
        lastXIsonCoordonate += 80;
        group.getChildren().addAll(svgPath);
    }

    private void drawElafron() {
        System.out.println("drawElafron");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M90 230 c-29 -29 -26 -74 8 -100 24 -19 37 -21 109 -18 74 3 89 7 177 52 53 27 104 58 113 68 15 17 13 18 -47 18 -62 0 -63 0 -46 -19 17 -19 16 -21 -25 -50 -69 -51 -167 -73 -212 -50 -29 16 -37 28 -37 60 0 29 13 44 45 52 11 2 1 5 -22 6 -31 1 -49 -5 -63 -19z");
        svgPath.setScaleX(0.1);
        svgPath.setScaleY(0.1);
        svgPath.setTranslateX(lastXIsonCoordonate);
        lastXIsonCoordonate += 80;
        group.getChildren().addAll(svgPath);
    }

    public void drawIson() {
        System.out.println("drawIson");
        SVGPath svgPath = new SVGPath();
        //svgPath.setContent("M390 199 c-229 -10 -314 -30 -340 -78 -24 -46 0 -82 41 -61 23 13 24 26 4 34 -27 10 -16 37 21 52 30 13 68 14 223 8 182 -6 187 -6 214 16 28 23 36 41 15 38 -7 0 -87 -5 -178 -9z");
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
        //svgPath.setContent("M334 180 c-220 -5 -244 -7 -263 -24 -12 -11 -21 -22 -21 -25 0 -3 110 -4 245 -1 236 5 245 6 267 27 12 12 20 24 17 25 -2 2 -113 1 -245 -2z");
        svgPath.setContent("M320 160 c-220 -5 -244 -7 -263 -24 -12 -11 -21 -22 -21 -25 0 -3 110 -4 245 -1 236 5 245 6 267 27 12 12 20 24 17 25 -2 2 -113 1 -245 -2z");
        svgPath.setScaleX(0.1);
        svgPath.setScaleY(0.1);
        svgPath.setTranslateX(lastXIsonCoordonate);
        lastXIsonCoordonate += 60;
        group.getChildren().addAll(svgPath);
    }

    public void drawApostrophos() {
        System.out.println("drawApostrophos");
        SVGPath svgPath = new SVGPath();
        //svgPath.setContent("M157 183 c-4 -3 2 -12 13 -20 11 -8 20 -25 20 -39 0 -30 -44 -52 -121 -61 -52 -6 -68 -23 -21 -23 43 0 139 26 167 44 14 9 31 29 38 43 10 22 8 28 -12 44 -23 19 -71 26 -84 12z");
        svgPath.setContent("M300 200 c-4 -3 2 -12 13 -20 11 -8 20 -25 20 -39 0 -30 -44 -52 -121 -61 -52 -6 -68 -23 -21 -23 43 0 139 26 167 44 14 9 31 29 38 43 10 22 8 28 -12 44 -23 19 -71 26 -84 12z");
        svgPath.setScaleX(0.1);
        svgPath.setScaleY(0.1);
        svgPath.setTranslateX(lastXIsonCoordonate);
        lastXIsonCoordonate += 30;
        group.getChildren().addAll(svgPath);
    }

    //https://convertio.co/fr/png-converter/
}
