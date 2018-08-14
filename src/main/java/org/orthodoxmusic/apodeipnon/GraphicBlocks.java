package org.orthodoxmusic.apodeipnon;

import javafx.scene.Group;
import org.orthodoxmusic.apodeipnon.letters.french.Letter;
import org.orthodoxmusic.apodeipnon.neumes.Ison;
import org.orthodoxmusic.apodeipnon.neumes.Neume;

import java.util.*;

public class GraphicBlocks {

    private Map<Integer,GraphicBlock> internalMap = new HashMap<Integer, GraphicBlock>();
    private double currentLetterX = 0;

    public GraphicBlocks() {
        createNewBlock();
    }

    public void createNewBlock() {
        int currentPosition = getCurrentIndice();
        currentLetterX = updateLetterX();
        System.out.println("creation d'un graphic block après currentPosition " + currentPosition + " avec pour currentLetterX " + currentLetterX);
        internalMap.put(++currentPosition,new GraphicBlock(currentPosition));
    }

    private double updateLetterX() {
        GraphicBlock lastBlock = getLastGraphicBlock();
        if(lastBlock != null) return lastBlock.getLastXPosition();
        return 0;
    }

    private GraphicBlock getLastGraphicBlock() {
        int currentIndice = getCurrentIndice();
        if(internalMap.containsKey(currentIndice)) {
            return internalMap.get(currentIndice);
        }
        return null;
    }

    public int getBlockCount() {
        return internalMap.size();
    }

    public void printlog() {
        Set<Integer> indices = internalMap.keySet();
        List<Integer> orderedIndices = new ArrayList(indices);
        Collections.sort(orderedIndices);
        for(Integer position : orderedIndices) {
            GraphicBlock graphicBlock = internalMap.get(position);
            graphicBlock.printlog();
        }
    }

    public void addLetterToTextualSymbols(Letter letter) {
        GraphicBlock currentGraphicBlock = getCurrentGraphicBlock();
        currentGraphicBlock.addLetterToTextualSymbols(letter);
    }

    private GraphicBlock getCurrentGraphicBlock() {
        return internalMap.get(getCurrentIndice());
    }

    private Integer getCurrentIndice() {
        return getMax(internalMap.keySet());
    }

    private Integer getMax(Set<Integer> integerSet) {
        int max = 0;
        for(Integer indice : integerSet) {
            if(max < indice) {
                max = indice;
            }
        }
        return max;
    }

    public void addNeumeToVerticalNeumeContainer(Neume neume) {
        GraphicBlock currentGraphicBlock = getCurrentGraphicBlock();
        currentGraphicBlock.addNeumeToVerticalBlock(neume);
    }

    public void drawBlocks(Group group) {
        internalMap.entrySet().stream()
                .forEach(entry -> entry.getValue().drawBlock(group));
    }

    public double getNewCurrentLetterX() {
        return currentLetterX;
    }
}
