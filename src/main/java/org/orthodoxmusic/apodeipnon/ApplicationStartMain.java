package org.orthodoxmusic.apodeipnon;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.orthodoxmusic.apodeipnon.letters.french.*;
import org.orthodoxmusic.apodeipnon.neumes.*;

import java.util.*;


public class ApplicationStartMain extends Application implements EventHandler<KeyEvent>{

    Canvas canvas = new Canvas(800,600);
    Group group = new Group(canvas);
    Scene scene = new Scene(group);
    Stage globalStage;

    UserInputList userInputList = new UserInputList();
    private InputPhase inputPhase = new InputPhase();
    private GraphicBlocks allBlocks = new GraphicBlocks();

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
        drawTextInterface();
        stage.show();
    }

    @Override
    public void handle(KeyEvent e)
    {
        KeyCode keyCode = e.getCode();
        System.out.println("keyevent " + keyCode.getName());

        handleNoPhaseEvent(keyCode);
        updateInputPhaseWithNewInput(keyCode);

        if(inputPhase.isNeumesPhase()) {
            updateNeumesInputPhase(keyCode);
            drawNeumesInterface();
        } else if(inputPhase.isNewBlockPhase()) {
            drawTextInterface();
            allBlocks.createNewBlock();
            inputPhase.setTextPhase();
            allBlocks.printlog();
        } else if(inputPhase.isTextPhase()) {
            updateTextInputPhase(keyCode);
        }
    }

    private void drawTextInterface() {
        System.out.println("DRAW TEXT INTERFACE");
        Text textParoles = new Text();
        textParoles.setText("SAISIE DU TEXTE");
        textParoles.setX(500);
        textParoles.setY(500);
        textParoles.setId("saisietexte");
        removeNode("saisieneumes");
        group.getChildren().addAll(textParoles);
    }

    private void removeNode(String idNodeToRemove) {
        ObservableList<Node> children = group.getChildren();
        ObservableList<Node> newChildren = FXCollections.observableArrayList();
        for(Node node : children) {
            if(node.getId() != null && node.getId().equals(idNodeToRemove)) continue;
            newChildren.add(node);
        }
        group.getChildren().removeAll(children);
        group.getChildren().addAll(newChildren);
    }

    private void drawNeumesInterface() {
        System.out.println("DRAW NEUMES INTERFACE");
        Text textNeumes = new Text();
        textNeumes.setText("SAISIE DES NEUMES");
        textNeumes.setX(500);
        textNeumes.setY(500);
        textNeumes.setId("saisieneumes");
        removeNode("saisietexte");
        group.getChildren().addAll(textNeumes);
    }

    private void handleNoPhaseEvent(KeyCode keyCode) {
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

    private void updateInputPhaseWithNewInput(KeyCode keyCode) {
        inputPhase.setCurrentType(keyCode.getName());
    }

    private void updateNeumesInputPhase(KeyCode keyCode) {
        System.out.println("ENTER NEUMES MODE");
        if (keyCode.getName().equals("I")) {
            drawIson();
        }
        else if (keyCode.getName().equals("O")) {
            drawOligon();
        }
        else if (keyCode.getName().equals("A")) {
            drawApostrophos();
        }
        else if (keyCode.getName().equals("E")) {
            drawElafron();
        }
        else if (keyCode.getName().equals("P")) {
            drawPetastie();
        }
        else if (keyCode.getName().equals("K")) {
            drawKendimata();
        }
    }

    private void updateTextInputPhase(KeyCode keyCode) {
        System.out.println("ENTER TEXT MODE");
        if (keyCode.getName().equals("A")) {
            drawLetterA();
        }
        else if (keyCode.getName().equals("L")) {
            drawLetterL();
        }
        else if (keyCode.getName().equals("E")) {
            drawLetterE();
        }
        else if (keyCode.getName().equals("I")) {
            drawLetterI();
        }
        else if (keyCode.getName().equals("U")) {
            drawLetterU();
        }
        else if (keyCode.getName().equals("8")) {
            drawUnderline();
        }
    }

    public void drawIson() {
        System.out.println("drawIson");
        Ison ison = new Ison(currentNeumeX,currentNeumeY);
        currentNeumeX += ison.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(ison));
        allBlocks.addNeumeToVerticalNeumeContainer(ison);
        group.getChildren().addAll(ison.getSvgPath());
    }

    public void drawApostrophos() {
        System.out.println("drawApostrophos");
        Apostrophos apostrophos = new Apostrophos(currentNeumeX,currentNeumeY);
        currentNeumeX += apostrophos.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(apostrophos));
        allBlocks.addNeumeToVerticalNeumeContainer(apostrophos);
        group.getChildren().addAll(apostrophos.getSvgPath());
    }

    private void drawPetastie() {
        System.out.println("drawPetastie");
        Petastie petastie = new Petastie(currentNeumeX,currentNeumeY);
        currentNeumeX += petastie.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(petastie));
        allBlocks.addNeumeToVerticalNeumeContainer(petastie);
        group.getChildren().addAll(petastie.getSvgPath());
    }

    private void drawElafron() {
        System.out.println("drawElafron");
        Elaphron elaphron = new Elaphron(currentNeumeX,currentNeumeY);
        currentNeumeX += elaphron.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(elaphron));
        allBlocks.addNeumeToVerticalNeumeContainer(elaphron);
        group.getChildren().addAll(elaphron.getSvgPath());
    }


    public void drawOligon() {
        System.out.println("drawOligon");
        Oligon oligon = new Oligon(currentNeumeX, currentNeumeY);
        currentNeumeX += oligon.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(oligon));
        allBlocks.addNeumeToVerticalNeumeContainer(oligon);
        group.getChildren().addAll(oligon.getSvgPath());
    }

    public void drawKendimata() {
        System.out.println("drawKendimata");
        Kendimata kendimata = new Kendimata(currentNeumeX, currentNeumeY);
        currentNeumeX += kendimata.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(kendimata));
        allBlocks.addNeumeToVerticalNeumeContainer(kendimata);
        group.getChildren().addAll(kendimata.getSvgPath());
    }

    public void drawLetterA() {
        System.out.println("letter A");
        LetterA letterA = new LetterA(currentLetterX,currentLetterY);
        currentLetterX += letterA.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(letterA));
        allBlocks.addLetterToTextualSymbols(letterA);
        group.getChildren().addAll(letterA.getSvgPath());
    }

    public void drawLetterL() {
        System.out.println("letter L");
        LetterL letterL = new LetterL(currentLetterX,currentLetterY);
        currentLetterX += letterL.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(letterL));
        allBlocks.addLetterToTextualSymbols(letterL);
        group.getChildren().addAll(letterL.getSvgPath());
    }

    public void drawLetterE() {
        System.out.println("letter E");
        LetterE letterE = new LetterE(currentLetterX, currentLetterY);
        currentLetterX += letterE.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(letterE));
        allBlocks.addLetterToTextualSymbols(letterE);
        group.getChildren().addAll(letterE.getSvgPath());
    }

    public void drawLetterU() {
        System.out.println("letter U");
        LetterU letterU = new LetterU(currentLetterX, currentLetterY);
        currentLetterX += letterU.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(letterU));
        allBlocks.addLetterToTextualSymbols(letterU);
        group.getChildren().addAll(letterU.getSvgPath());
    }

    public void drawLetterI() {
        System.out.println("letter I");
        LetterI letterI = new LetterI(currentLetterX, currentLetterY);
        currentLetterX += letterI.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(letterI));
        allBlocks.addLetterToTextualSymbols(letterI);
        group.getChildren().addAll(letterI.getSvgPath());
    }

    public void drawUnderline() {
        System.out.println("symbol underscore");
        Underscore underscore = new Underscore(currentLetterX,currentLetterY);
        currentLetterX += underscore.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(underscore));
        allBlocks.addLetterToTextualSymbols(underscore);
        group.getChildren().addAll(underscore.getSvgPath());
    }

}
