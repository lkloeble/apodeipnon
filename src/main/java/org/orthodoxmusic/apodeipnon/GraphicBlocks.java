package org.orthodoxmusic.apodeipnon;

import org.orthodoxmusic.apodeipnon.letters.french.Letter;
import org.orthodoxmusic.apodeipnon.neumes.Ison;
import org.orthodoxmusic.apodeipnon.neumes.Neume;

import java.util.*;

public class GraphicBlocks {

    private Map<Integer,GraphicBlock> internalMap = new HashMap<Integer, GraphicBlock>();

    public GraphicBlocks() {
        createNewBlock();
    }

    public void createNewBlock() {
        int currentPosition = getCurrentIndice();
        System.out.println("creation d'un graphic block après currentPosition " + currentPosition);
        internalMap.put(++currentPosition,new GraphicBlock(currentPosition));
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
}
