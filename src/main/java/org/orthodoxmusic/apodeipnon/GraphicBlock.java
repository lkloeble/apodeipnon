package org.orthodoxmusic.apodeipnon;

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
}
