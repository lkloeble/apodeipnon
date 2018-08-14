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

import java.io.IOException;
import java.util.*;


public class ApplicationStartMain extends Application implements EventHandler<KeyEvent>{

    Canvas canvas = new Canvas(800,600);
    Group group = new Group(canvas);
    Scene scene = new Scene(group);
    Stage globalStage;
    KeyboardMapper keyboardMapper;
    static UserArguments userArguments;

    UserInputList userInputList = new UserInputList();
    private InputPhase inputPhase = new InputPhase();
    private GraphicBlocks allBlocks = new GraphicBlocks();

    private double currentNeumeX = 0;
    private double currentNeumeY = 0;
    private double currentLetterX = 0;
    private double currentLetterY = 0;

    public static void main(String[] args) {
        System.out.println("on passe par main avec " + args.length + " arguments");
        userArguments = new UserArguments(args);
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        scene.setOnKeyPressed(this);
        stage.setScene(scene);
        stage.setTitle("Apodeipnon Application");
        System.out.println("on peut logger ");
        try {
            keyboardMapper = new KeyboardMapper(userArguments.hasMapping());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        globalStage = stage;
        drawTextInterface();
        stage.show();
    }

    @Override
    public void handle(KeyEvent e)
    {
        KeyCode keyCode = e.getCode();
        System.out.println("keyevent " + keyCode.getName());

        String mappedKeyCode = keyboardMapper.getMapping(keyCode);
        System.out.println("keyevent après mapping : " + mappedKeyCode);


        eraseEveryNodes();
        showReperes();
        handleNoPhaseEvent(mappedKeyCode);
        updateInputPhaseWithNewInput(mappedKeyCode);

        if(inputPhase.isNeumesPhase()) {
            updateNeumesInputPhase(mappedKeyCode);
            drawNeumesInterface();
        } else if(inputPhase.isNewBlockPhase()) {
            drawTextInterface();
            allBlocks.createNewBlock();
            currentLetterX = allBlocks.getNewCurrentLetterX();
            currentNeumeX = allBlocks.getNewCurrentLetterX();
            System.out.println("*****newPhase with currentLetter " + currentLetterX + " currentNeumeX " + currentNeumeX);
            inputPhase.setTextPhase();
        } else if(inputPhase.isTextPhase()) {
            drawTextInterface();
            updateTextInputPhase(mappedKeyCode);
        }
        drawAllBlocks();
    }

    private void showReperes() {
        Text text0 = new Text();
        text0.setText("0");
        text0.setX(0);
        text0.setY(250);
        Text text100 = new Text();
        text100.setText("100");
        text100.setX(100);
        text100.setY(250);
        Text text200 = new Text();
        text200.setText("200");
        text200.setX(200);
        text200.setY(250);
        group.getChildren().addAll(text0);
        group.getChildren().addAll(text100);
        group.getChildren().addAll(text200);
    }

    private void eraseEveryNodes() {
        group.getChildren().removeAll(group.getChildren());
    }

    private void drawAllBlocks() {
        allBlocks.drawBlocks(group);
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

    private void handleNoPhaseEvent(String keyCode) {
        if(keyCode.equals("Enter")) {
            System.out.println("enter");
            currentNeumeY += 80;
            currentLetterY += 80;
            currentNeumeX = 0;
            currentLetterX = 0;
        }
        if(keyCode.equals("Backspace")) {
            System.out.println("asked for backspace");
            ObservableList<Node> groupChildren = group.getChildren();
            group.getChildren().removeAll(groupChildren);
            currentNeumeX = 0;
            userInputList.eraseLastUserInput();
            group.getChildren().addAll(userInputList.getAllSVGPathes());
            currentNeumeX = userInputList.getCurrentX();
        }
    }

    private void updateInputPhaseWithNewInput(String keyCode) {
        inputPhase.setCurrentType(keyCode);
    }

    private void updateNeumesInputPhase(String keyCode) {
        System.out.println("ENTER NEUMES MODE");
        if (keyCode.equals("I")) {
            drawIson();
        }
        else if (keyCode.equals("O")) {
            drawOligon();
        }
        else if (keyCode.equals("A")) {
            drawApostrophos();
        }
        else if (keyCode.equals("E")) {
            drawElafron();
        }
        else if (keyCode.equals("P")) {
            drawPetastie();
        }
        else if (keyCode.equals("K")) {
            drawKendimata();
        }
    }

    private void updateTextInputPhase(String keyCode) {
        System.out.println("ENTER TEXT MODE");
        if (keyCode.equals("A")) {
            drawLetterA();
        }
        else if (keyCode.equals("L")) {
            drawLetterL();
        }
        else if (keyCode.equals("E")) {
            drawLetterE();
        }
        else if (keyCode.equals("I")) {
            drawLetterI();
        }
        else if (keyCode.equals("U")) {
            drawLetterU();
        }
        else if (keyCode.equals("8")) {
            drawUnderline();
        }
    }

    public void drawIson() {
        System.out.println("drawIson");
        Ison ison = new Ison(currentNeumeX,currentNeumeY);
        currentNeumeX += ison.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(ison));
        allBlocks.addNeumeToVerticalNeumeContainer(ison);
        //group.getChildren().addAll(ison.getSvgPath());
    }

    public void drawApostrophos() {
        System.out.println("drawApostrophos");
        Apostrophos apostrophos = new Apostrophos(currentNeumeX,currentNeumeY);
        currentNeumeX += apostrophos.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(apostrophos));
        allBlocks.addNeumeToVerticalNeumeContainer(apostrophos);
        //group.getChildren().addAll(apostrophos.getSvgPath());
    }

    private void drawPetastie() {
        System.out.println("drawPetastie");
        Petastie petastie = new Petastie(currentNeumeX,currentNeumeY);
        currentNeumeX += petastie.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(petastie));
        allBlocks.addNeumeToVerticalNeumeContainer(petastie);
        //group.getChildren().addAll(petastie.getSvgPath());
    }

    private void drawElafron() {
        System.out.println("drawElafron");
        Elaphron elaphron = new Elaphron(currentNeumeX,currentNeumeY);
        currentNeumeX += elaphron.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(elaphron));
        allBlocks.addNeumeToVerticalNeumeContainer(elaphron);
        //group.getChildren().addAll(elaphron.getSvgPath());
    }


    public void drawOligon() {
        System.out.println("drawOligon");
        Oligon oligon = new Oligon(currentNeumeX, currentNeumeY);
        currentNeumeX += oligon.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(oligon));
        allBlocks.addNeumeToVerticalNeumeContainer(oligon);
        //group.getChildren().addAll(oligon.getSvgPath());
    }

    public void drawKendimata() {
        System.out.println("drawKendimata");
        Kendimata kendimata = new Kendimata(currentNeumeX, currentNeumeY);
        currentNeumeX += kendimata.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(kendimata));
        allBlocks.addNeumeToVerticalNeumeContainer(kendimata);
        //group.getChildren().addAll(kendimata.getSvgPath());
    }

    public void drawLetterA() {
        System.out.println("letter A");
        LetterA letterA = new LetterA(currentLetterX,currentLetterY);
        currentLetterX += letterA.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(letterA));
        allBlocks.addLetterToTextualSymbols(letterA);
        //group.getChildren().addAll(letterA.getSvgPath());
    }

    public void drawLetterL() {
        System.out.println("letter L");
        LetterL letterL = new LetterL(currentLetterX,currentLetterY);
        currentLetterX += letterL.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(letterL));
        allBlocks.addLetterToTextualSymbols(letterL);
        //group.getChildren().addAll(letterL.getSvgPath());
    }

    public void drawLetterE() {
        System.out.println("letter E");
        LetterE letterE = new LetterE(currentLetterX, currentLetterY);
        currentLetterX += letterE.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(letterE));
        allBlocks.addLetterToTextualSymbols(letterE);
        //group.getChildren().addAll(letterE.getSvgPath());
    }

    public void drawLetterU() {
        System.out.println("letter U");
        LetterU letterU = new LetterU(currentLetterX, currentLetterY);
        currentLetterX += letterU.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(letterU));
        allBlocks.addLetterToTextualSymbols(letterU);
        //group.getChildren().addAll(letterU.getSvgPath());
    }

    public void drawLetterI() {
        System.out.println("letter I");
        LetterI letterI = new LetterI(currentLetterX, currentLetterY);
        currentLetterX += letterI.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(letterI));
        allBlocks.addLetterToTextualSymbols(letterI);
        //group.getChildren().addAll(letterI.getSvgPath());
    }

    public void drawUnderline() {
        System.out.println("symbol underscore");
        Underscore underscore = new Underscore(currentLetterX,currentLetterY);
        currentLetterX += underscore.getHorizontalSpace();
        userInputList.addUserInput(new UserInput(underscore));
        allBlocks.addLetterToTextualSymbols(underscore);
        //group.getChildren().addAll(underscore.getSvgPath());
    }

}
