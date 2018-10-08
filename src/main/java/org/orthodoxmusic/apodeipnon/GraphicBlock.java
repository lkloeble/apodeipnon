package org.orthodoxmusic.apodeipnon;

import org.orthodoxmusic.apodeipnon.letters.french.Letter;
import org.orthodoxmusic.apodeipnon.neumes.Neume;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class GraphicBlock {
/*
    private int blockIndice;
    private TextualSymbols textualSymbols;
    private NeumeVerticalBlock neumeVerticalBlock;
    private Long blockId;

    public GraphicBlock(int blockIndice) {
        textualSymbols = new TextualSymbols();
        neumeVerticalBlock = new NeumeVerticalBlock();
        this.blockIndice = blockIndice;
        this.blockId = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
    }

    public void addLetterToTextualSymbols(Letter letter) {
        textualSymbols.addLetter(letter);
    }

    public void addNeumeToVerticalBlock(Neume neume) {
        neumeVerticalBlock.addNeume(neume);
    }

    public void printlog() {
        System.out.println("GB => " + blockIndice + " [" + blockId + "]");
        textualSymbols.printlog();
        neumeVerticalBlock.printlog();
    }

    /*
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
        double textualSymbolsLastXPosition = textualSymbols.getLastXPosition();
        double neumeLastXPosition = neumeVerticalBlock.getLastXPosition();
        System.out.println("lastXBlock : T:" + textualSymbolsLastXPosition + " N:" + neumeLastXPosition);
        return neumeLastXPosition > textualSymbolsLastXPosition ? neumeLastXPosition : textualSymbolsLastXPosition;
    }

    public boolean isEmpty() {
        return textualSymbols.isEmpty() && neumeVerticalBlock.isEmpty();
    }

    public Long getBlockId() {
        return blockId;
    }
    */
}
