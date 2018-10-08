package org.orthodoxmusic.apodeipnon;

import org.orthodoxmusic.apodeipnon.neumes.Neume;

import java.util.*;

public class NeumeVerticalBlock {

    private Map<Integer,Neume> neumes = new HashMap<>();

    public NeumeVerticalBlock(String content) {
        addNeumes(content);
    }

    private void addNeumes(String content) {
        StringTokenizer stringTokenizer = new StringTokenizer(content, "|");
        int indice = 0;
        while(stringTokenizer.hasMoreTokens()) {
            Neume neume = Neume.getNeume(stringTokenizer.nextToken());
            neumes.put(indice,neume);
            indice++;
        }
    }

    public Map<Integer,Neume> getNeumes() {
        return neumes;
    }

    public String getAllSvgData(TextLinePositions textLinePositions, int currentXPosition) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        Set<Integer> neumesIndices = getNeumes().keySet();
        for(Integer indice : neumesIndices) {
            Neume neume = getNeumes().get(indice);
            stringJoiner.add(neume.getNeumeSVG(textLinePositions,currentXPosition));
        }

        return stringJoiner.toString();
    }

    public int getXStart() {
        int xStart = Integer.MAX_VALUE;
        for(Integer indice : neumes.keySet()) {
            Neume neume = neumes.get(indice);
            if(neume.getXStart() < xStart) {
                xStart = neume.getXStart();
            }
        }
        return xStart;
    }

    public int getXEnd() {
        int xEnd = 0;
        for(Integer indice : neumes.keySet()) {
            Neume neume = neumes.get(indice);
            if(neume.getXEnd() > xEnd) {
                xEnd = neume.getXEnd();
            }
        }
        return xEnd;
    }

    public int getLength() {
        int maxLength = 0;
        for(Integer indice : neumes.keySet()) {
        Neume neume = neumes.get(indice);
        if(neume.getLength() > maxLength) {
                maxLength = neume.getLength();
            }
        }
        return maxLength;
    }

    @Override
    public String toString() {
        return "NeumeVerticalBlock{" +
                "neumes=" + neumes +
                '}';
    }

    public boolean hasUnspokenNeume() {
        for(Integer indice : neumes.keySet()) {
            Neume neume = neumes.get(indice);
            if(neume.isUnspoken()) return true;
        }
        return false;
    }
}
