package org.orthodoxmusic.apodeipnon;

import javafx.scene.Group;
import org.orthodoxmusic.apodeipnon.letters.french.Letter;
import org.orthodoxmusic.apodeipnon.neumes.Neume;

import java.util.*;

public class GraphicBlocks {

    private Map<Integer,GraphicBlock> internalMap = new HashMap<Integer, GraphicBlock>();
    private double currentLetterX = 0;

    public GraphicBlocks() {
        createNewBlock();
    }

    public void createNewBlock() {
        if(currentBlockIsEmpty()) return;
        int currentPosition = getCurrentIndice();
        currentLetterX = updateLetterX();
        internalMap.put(++currentPosition,new GraphicBlock(currentPosition));
    }

    private boolean currentBlockIsEmpty() {
        Integer currentIndice = getCurrentIndice();
        if(currentIndice == 0) return false;
        GraphicBlock currentGraphicBlock = internalMap.get(currentIndice);
        return currentGraphicBlock.isEmpty();
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

    private int getMax(Set<Integer> integerSet) {
        return integerSet.stream()
                .mapToInt(nb -> nb).max().orElse(0);
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
