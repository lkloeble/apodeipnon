package org.orthodoxmusic.apodeipnon;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.SVGPath;
import javafx.stage.Stage;
import org.orthodoxmusic.apodeipnon.letters.french.LetterA;
import org.orthodoxmusic.apodeipnon.letters.french.Underscore;
import org.orthodoxmusic.apodeipnon.neumes.*;


public class HelloWorldApplication extends Application implements EventHandler<KeyEvent>{

    Canvas canvas = new Canvas(800,600);
    Group group = new Group(canvas);
    Scene scene = new Scene(group);
    Stage globalStage;
    UserInputList userInputList = new UserInputList();
    private int currentNeumeX = 0;
    private int currentNeumeY = 0;
    private int currentLetterX = 0;
    private int currentLetterY = 0;

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
        System.out.println("keyevent " + keyCode.getName());
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
        if(keyCode.getName().equals("L")) {
            drawLetter();
        }
        if(keyCode.getName().equals("8")) {
            drawUnderline();
        }
        if(keyCode.getName().equals("Enter")) {
            System.out.println("enter");
            currentNeumeY += 80;
            currentLetterY += 80;
            currentNeumeX = 0;
            currentLetterX = 0;
        }
        if(keyCode.getName().equals("Backspace")) {
            System.out.println("asked for backspace");
            ObservableList<Node> groupChildren = group.getChildren();
            group.getChildren().removeAll(groupChildren);
            currentNeumeX = 0;
            userInputList.eraseLastUserInput();
            group.getChildren().addAll(userInputList.getAllSVGPathes());
            currentNeumeX = userInputList.getCurrentX();
        }
    }


    public void drawIson() {
        System.out.println("drawIson");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M890 300 c-36 -13 -127 -17 -465 -23 -493 -9 -710 -29 -970 -87 -182 -40 -315 -147 -338 -270 -13 -67 29 -138 89 -149 54 -10 184 62 184 101 0 7 -19 20 -41 31 -68 30 -89 51 -89 89 0 63 90 115 235 136 48 7 246 5 654 -6 321 -9 598 -13 615 -9 55 12 104 42 161 101 83 85 68 121 -35 86z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        Ison ison = new Ison(svgPath);
        currentNeumeX += ison.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(ison));
        group.getChildren().addAll(svgPath);
    }

    public void drawApostrophos() {
        System.out.println("drawApostrophos");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M89 269 c-19 -12 -6 -28 29 -36 39 -9 96 -74 110 -126 37 -138 -150 -238 -495 -266 -79 -6 -100 -11 -100 -23 0 -24 184 -18 317 9 309 63 478 174 478 314 0 43 -4 54 -34 81 -18 18 -51 37 -73 44 -46 14 -211 16 -232 3z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        Apostrophos apostrophos = new Apostrophos(svgPath);
        currentNeumeX += apostrophos.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(apostrophos));
        group.getChildren().addAll(svgPath);
    }

    private void drawPetastie() {
        System.out.println("drawPetastie");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M205 290 c-179 -25 -459 -154 -842 -387 -69 -42 -95 -75 -76 -94 5 -5 93 -12 196 -16 144 -5 190 -3 202 7 22 19 19 25 -25 45 -98 44 -87 101 36 184 93 61 256 142 363 178 65 22 94 26 206 27 116 1 135 -1 180 -22 96 -44 144 -114 145 -211 0 -88 -57 -161 -128 -161 -40 0 -82 -13 -82 -26 0 -22 21 -28 96 -26 76 1 174 28 232 64 46 28 81 93 88 164 12 116 -66 208 -214 255 -76 24 -272 34 -377 19z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        Petastie petastie = new Petastie(svgPath);
        currentNeumeX += petastie.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(petastie));
        group.getChildren().addAll(svgPath);
    }

    private void drawElafron() {
        System.out.println("drawElafron");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-474 287 c-60 -12 -147 -49 -173 -73 -36 -33 -63 -93 -69 -152 -4 -42 -1 -63 17 -99 64 -134 241 -196 502 -176 212 16 383 84 772 305 188 107 236 145 220 172 -10 16 -29 18 -201 21 -155 2 -192 0 -202 -12 -10 -11 -4 -18 31 -38 23 -12 49 -35 57 -50 14 -25 14 -29 -5 -55 -53 -73 -341 -228 -499 -269 -44 -11 -108 -18 -175 -18 -101 -1 -108 0 -175 34 -86 43 -125 93 -133 169 -6 69 4 112 36 149 23 27 38 35 97 45 48 9 71 18 73 29 5 27 -82 36 -173 18z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        Elaphron elaphron = new Elaphron(svgPath);
        currentNeumeX += elaphron.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(elaphron));
        group.getChildren().addAll(svgPath);
    }


    public void drawOligon() {
        System.out.println("drawOligon");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M910 150 c-31 -14 -124 -16 -820 -21 l-785 -5 -41 -22 c-50 -26 -134 -118 -134 -144 0 -26 23 -34 52 -17 18 10 181 14 808 18 883 6 823 0 908 83 58 56 79 95 60 112 -10 10 -20 9 -48 -4z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        Oligon oligon = new Oligon(svgPath);
        currentNeumeX += oligon.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(oligon));
        group.getChildren().addAll(svgPath);
    }

    public void drawKendimata() {
        System.out.println("drawKendimata");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-148 212 c-45 -6 -66 -37 -108 -163 -29 -87 -43 -115 -67 -134 -44 -34 -29 -46 55 -45 127 2 127 2 165 99 47 124 83 198 99 204 7 3 13 12 13 19 0 22 -69 31 -157 20z M250 212 c-47 -7 -60 -26 -105 -153 -33 -94 -48 -125 -72 -144 -50 -39 -30 -49 80 -44 107 6 109 8 138 87 43 116 79 195 96 210 10 8 18 21 18 27 0 19 -79 28 -155 17z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        svgPath.setId("kendimata");
        Kendimata kendimata = new Kendimata(svgPath);
        currentNeumeX += kendimata.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(kendimata));
        group.getChildren().addAll(svgPath);
    }

    public void drawLetter() {
        System.out.println("letter A");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-110 250 c-34 -19 -53 -64 -44 -107 16 -70 51 -94 173 -118 57 -12 62 -15 62 -39 -1 -85 -140 -114 -170 -35 -14 35 -30 29 -30 -11 0 -33 4 -38 43 -55 50 -23 127 -26 167 -5 54 28 60 47 60 195 0 140 5 160 42 160 10 0 18 5 18 10 0 6 -28 10 -64 10 l-65 0 -3 -31 -3 -31 -45 36 c-50 39 -95 46 -141 21z m161 -65 c28 -20 30 -26 30 -85 l0 -63 -42 9 c-99 21 -118 39 -118 108 0 27 6 43 18 51 24 15 76 5 112 -20z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentLetterX);
        svgPath.setTranslateY(currentLetterY);
        svgPath.setId("letter A");
        LetterA letterA = new LetterA(svgPath);
        currentLetterX += letterA.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(letterA));
        group.getChildren().addAll(svgPath);
    }

    public void drawUnderline() {
        System.out.println("symbol underscore");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-200 72 c0 -19 7 -20 230 -20 223 0 230 1 230 20 0 19 -7 20 -230 20 -223 0 -230 -1 -230 -20z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentLetterX);
        svgPath.setTranslateY(currentLetterY);
        svgPath.setId("symbol underscore");
        Underscore underscore = new Underscore(svgPath);
        currentLetterX += underscore.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(underscore));
        group.getChildren().addAll(svgPath);
    }

}
