package org.orthodoxmusic.apodeipnon;

import javafx.scene.Group;
import org.orthodoxmusic.apodeipnon.letters.french.Letter;
import org.orthodoxmusic.apodeipnon.neumes.Neume;

public class GraphicBlock {

    private int blockIndice;
    private TextualSymbols textualSymbols;
    private NeumeVerticalBlock neumeVerticalBlock;

    public GraphicBlock(int blockIndice) {
        textualSymbols = new TextualSymbols();
        neumeVerticalBlock = new NeumeVerticalBlock();
        this.blockIndice = blockIndice;
        System.out.println("NEW GB indice " + blockIndice);
    }

    public void addLetterToTextualSymbols(Letter letter) {
        textualSymbols.addLetter(letter);
    }

    public void addNeumeToVerticalBlock(Neume neume) {
        neumeVerticalBlock.addNeume(neume);
    }

    public void printlog() {
        System.out.print("block indice : " + blockIndice + " => ");
        textualSymbols.printlog();
        neumeVerticalBlock.printlog();
    }

    public void drawBlock(Group group) {
        System.out.println("group graphicalSize " + getGraphicalSize() + " lastXPosition " + getLastXPosition());
        textualSymbols.draw(group);
        neumeVerticalBlock.draw(group);
    }

    private int getGraphicalSize() {
        int graphicalSize = textualSymbols.getGraphicalSize();
        return neumeVerticalBlock.getGraphicalSize() > graphicalSize ? neumeVerticalBlock.getGraphicalSize() : graphicalSize;
    }

    public double getLastXPosition() {
        double lastXPosition = textualSymbols.getLastXPosition();
        double neumeLastXPosition = neumeVerticalBlock.getLastXPosition();
        System.out.println("lastXPosition text : " + lastXPosition + " neumes " + neumeLastXPosition);
        return neumeLastXPosition > lastXPosition ? neumeLastXPosition : lastXPosition;
    }
}
