package org.orthodoxmusic.apodeipnon;

import org.orthodoxmusic.apodeipnon.neumes.Neume;
import org.orthodoxmusic.apodeipnon.neumes.NullNeume;

import java.util.*;

public class NeumeVerticalBlock {

    private Map<Integer,Neume> neumes = new HashMap<>();

    public NeumeVerticalBlock(String content) {
        addNeumes(content);
    }

    private void addNeumes(String content) {
        content = inversPsefestonWithPrincipalNeume(content);
        StringTokenizer stringTokenizer = new StringTokenizer(content, "|");
        int indice = 0;
        Neume previousNeume = new NullNeume();
        while(stringTokenizer.hasMoreTokens()) {
            Neume neume = Neume.getNeume(stringTokenizer.nextToken(),previousNeume);
            previousNeume = neume;
            neumes.put(indice,neume);
            indice++;
        }
    }

    private String inversPsefestonWithPrincipalNeume(String content) {
        if(!content.contains("psefeston")) return content;
        StringJoiner stringJoiner = new StringJoiner(" ");
        StringTokenizer stringTokenizer = new StringTokenizer(content, " ");
        while(stringTokenizer.hasMoreTokens()) {
            String someNeumes = stringTokenizer.nextToken();
            if(!someNeumes.contains("psefeston")) stringJoiner.add(someNeumes);
            else {
                StringTokenizer psefestonTokenizer = new StringTokenizer(someNeumes, "|");
                StringJoiner stringJoinerPsefeston = new StringJoiner("|");
                while(psefestonTokenizer.hasMoreTokens()) {
                    String partOfPsefestonNeume = psefestonTokenizer.nextToken();
                    if(partOfPsefestonNeume.contains("psefeston"))continue;;
                    stringJoinerPsefeston.add(partOfPsefestonNeume);
                }
                stringJoinerPsefeston.add("psefeston");
                stringJoiner.add(stringJoinerPsefeston.toString());
            }
        }
        return stringJoiner.toString();
    }

    public Map<Integer,Neume> getNeumes() {
        return neumes;
    }

    public String getAllSvgData(TextLinePositions textLinePositions, int indiceInSentence, int currentXPosition, int maxHeightForNeumes) {
        StringJoiner stringJoiner = new StringJoiner("");
        Set<Integer> neumesIndices = getNeumes().keySet();
        for(Integer indice : neumesIndices) {
            Neume neume = getNeumes().get(indice);
            stringJoiner.add(neume.getNeumeSVG(textLinePositions,indiceInSentence,currentXPosition, maxHeightForNeumes));
            currentXPosition = neume.getXStart();
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
        if(neume.getLengthWithWordSpaceCorrection() > maxLength) {
                maxLength = neume.getLengthWithWordSpaceCorrection();
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

    public int getSpaceWithNextNeume() {
        int xSpace = 0;
        for(Integer indice : neumes.keySet()) {
            Neume neume = neumes.get(indice);
            if(neume.getXSpace() > xSpace) {
                xSpace = neume.getXSpace();
            }
        }
        return xSpace;
    }

    public int getHeight() {
        int height = 0;
        for(Integer indice : neumes.keySet()) {
            Neume neume = neumes.get(indice);
            if(neume.getHeight() > height) {
                height = neume.getHeight();
            }
        }
        return height;
    }

    public int getLengthWithSpace() {
        return getLength() + getSpaceWithNextNeume();
    }
}
