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
    }

    public void addLetterToTextualSymbols(Letter letter) {
        textualSymbols.addLetter(letter);
    }

    public void addNeumeToVerticalBlock(Neume neume) {
        neumeVerticalBlock.addNeume(neume);
    }

    public void printlog() {
        System.out.print("PRINTLOG : block indice : " + blockIndice + " => ");
        textualSymbols.printlog();
        neumeVerticalBlock.printlog();
    }

    public void drawBlock(Group group) {
        if(textualSymbols.getGraphicalSize() > neumeVerticalBlock.getGraphicalSize()) {
            textualSymbols.draw(group);
            neumeVerticalBlock.drawCenter(group, textualSymbols.getGraphicalSize());
        } else {
            textualSymbols.drawCenter(group, neumeVerticalBlock.getGraphicalSize());
            neumeVerticalBlock.draw(group);
        }
    }

    public double getLastXPosition() {
        double lastXPosition = textualSymbols.getLastXPosition();
        double neumeLastXPosition = neumeVerticalBlock.getLastXPosition();
        return neumeLastXPosition > lastXPosition ? neumeLastXPosition : lastXPosition;
    }
}
