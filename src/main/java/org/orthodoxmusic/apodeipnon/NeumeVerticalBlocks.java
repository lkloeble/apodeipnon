package org.orthodoxmusic.apodeipnon;

import org.orthodoxmusic.apodeipnon.neumes.Neume;

import java.util.*;

public class NeumeVerticalBlocks {

    private static final Integer DEFAULT_X_POSITION = 20;

    Map<Integer, NeumeVerticalBlock> neumeInHorizontalOrder = new HashMap<>();

    public void addNeumes(String content) {
        StringTokenizer stringTokenizer = new StringTokenizer(content, " ");
        while(stringTokenizer.hasMoreTokens()) {
            NeumeVerticalBlock neumeVerticalBlock = new NeumeVerticalBlock(stringTokenizer.nextToken());
            neumeInHorizontalOrder.put(getNextKey(), neumeVerticalBlock);
        }
    }

    private int getNextKey() {
        return neumeInHorizontalOrder.size() + 1;
    }

    public String getAllSvgData(TextLinePositions textLinePositions) {
        StringJoiner stringJoiner = new StringJoiner("");
        Set<Integer> indices = neumeInHorizontalOrder.keySet();
        int currentXPosition = DEFAULT_X_POSITION;
        int maxHeightForNeumes = getHeight();
        for(Integer indice : indices) {
            NeumeVerticalBlock neumeVerticalBlock = neumeInHorizontalOrder.get(indice);
            stringJoiner.add(neumeVerticalBlock.getAllSvgData(textLinePositions, indice, currentXPosition, maxHeightForNeumes));
            currentXPosition += neumeVerticalBlock.getLengthWithSpace();
        }
        return stringJoiner.toString();
    }

    public NeumesLinePositions getPositions() {
        NeumesLinePositions neumesLinePositions = new NeumesLinePositions();
        for(Integer indice : neumeInHorizontalOrder.keySet()) {
            NeumeVerticalBlock neumeVerticalBlock = neumeInHorizontalOrder.get(indice);
            neumesLinePositions.setWidthForOrder(indice,neumeVerticalBlock.getXStart(), neumeVerticalBlock.getXEnd(),neumeVerticalBlock.getSpaceWithNextNeume());
        }
        neumesLinePositions.setNeumeHeight(getHeight());
        return neumesLinePositions;
    }

    public boolean hasNoUnspokenNeumes() {
        for(Integer indice : neumeInHorizontalOrder.keySet()) {
            NeumeVerticalBlock neumeVerticalBlock = neumeInHorizontalOrder.get(indice);
            if(neumeVerticalBlock.hasUnspokenNeume()) return false;
        }
        return true;
    }

    public List<Integer> getUnSpokenNeumesPositions() {
        List<Integer> indicesList = new ArrayList<>();
        for(Integer indice : neumeInHorizontalOrder.keySet()) {
            NeumeVerticalBlock neumeVerticalBlock = neumeInHorizontalOrder.get(indice);
            if(neumeVerticalBlock.hasUnspokenNeume()) indicesList.add(indice);
        }
        return indicesList;
    }

    public int getHeight() {
        int height = 0;
        for(Integer indice : neumeInHorizontalOrder.keySet()) {
            NeumeVerticalBlock neumeVerticalBlock = neumeInHorizontalOrder.get(indice);
            if(neumeVerticalBlock.getHeight() > height) {
                height = neumeVerticalBlock.getHeight();
            }
        }
        return height;
    }

}
