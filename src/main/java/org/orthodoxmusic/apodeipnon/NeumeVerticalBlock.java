package org.orthodoxmusic.apodeipnon;

import org.orthodoxmusic.apodeipnon.neumes.Neume;
import org.orthodoxmusic.apodeipnon.neumes.NullNeume;

import java.util.*;

public class NeumeVerticalBlock {

    private Map<Integer, Neume> neumes = new HashMap<>();

    public NeumeVerticalBlock(String content) {
        addNeumes(content);
    }

    private void addNeumes(String content) {
        content = inversPsefestonWithPrincipalNeume(content);
        content = affectSpecialGorgonForUnderGorgons(content);
        content = affectFollowingNeumesForUnderGorgons(content);
        content = affectSpecialKlasmaFOrUnderKlasma(content);
        content = affectFollowingNeumesForUnderKlasma(content);
        StringTokenizer stringTokenizer = new StringTokenizer(content, "|");
        int indice = 0;
        Neume previousNeume = new NullNeume();
        Neume neume = new NullNeume();
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            if(token.startsWith("mart(")) {
                neume = Neume.getMartyrie(extractNote(token),extractDiatonique(token));
            } else {
                neume = Neume.getNeume(token, previousNeume);
            }
            previousNeume = neume;
            neumes.put(indice, neume);
            indice++;
        }
    }

    private String extractNote(String token) {
        return token.split("\\(")[1].split(",")[0];
    }

    private String extractDiatonique(String token) {
        return token.split("\\(")[1].split(",")[1].replace(")","");
    }

    private String affectFollowingNeumesForUnderGorgons(String content) {
        return affectFollowingNeumesForUnderNeumes(content, "startgorgon");
    }

    private String affectFollowingNeumesForUnderKlasma(String content) {
        return affectFollowingNeumesForUnderNeumes(content, "startklasma");
    }


    private String affectFollowingNeumesForUnderNeumes(String content, String neumeName) {
        if (!content.contains(neumeName)) return content;
        StringTokenizer neumeTokenizer = new StringTokenizer(content, "|");
        int indice = 0;
        StringJoiner gorgonJoiner = new StringJoiner("|");
        while (neumeTokenizer.hasMoreTokens()) {
            String neumeToken = neumeTokenizer.nextToken();
            if (indice == 0) {
                indice++;
                continue;
            } else if(indice == 1) {
                gorgonJoiner.add(neumeToken + "|" + neumeName);
            } else {
                gorgonJoiner.add(neumeToken);
            }
            indice++;
        }
        return gorgonJoiner.toString().replace("|(","(").replace(")",")|");
    }


    private String affectSpecialGorgonForUnderGorgons(String content) {
        return affectSpecialNeumeForUnderNeumes(content, "gorgon", "startgorgon");
    }

    private String affectSpecialKlasmaFOrUnderKlasma(String content) {
        return affectSpecialNeumeForUnderNeumes(content, "klasma", "startklasma");
    }

    private String affectSpecialNeumeForUnderNeumes(String content, String neumeName, String underneumeName) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        StringTokenizer stringTokenizer = new StringTokenizer(content, " ");
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            if (token.startsWith(neumeName)) {
                token = token.replace(neumeName, underneumeName);
            }
            stringJoiner.add(token);
        }
        return stringJoiner.toString();
    }


    private String inversPsefestonWithPrincipalNeume(String content) {
        if (!content.contains("psefeston")) return content;
        StringTokenizer psefestonTokenizer = new StringTokenizer(content, "|");
        StringJoiner stringJoinerPsefeston = new StringJoiner("|");
        while (psefestonTokenizer.hasMoreTokens()) {
            String partOfPsefestonNeume = psefestonTokenizer.nextToken();
            if (partOfPsefestonNeume.contains("psefeston")) continue;
            stringJoinerPsefeston.add(partOfPsefestonNeume);
        }
        stringJoinerPsefeston.add("psefeston");
        return stringJoinerPsefeston.toString().replace("klasma|psefeston","psefeston|klasma");
    }

    public Map<Integer, Neume> getNeumes() {
        return neumes;
    }

    public String getAllSvgData(TextLinePositions textLinePositions, int indiceInSentence, int currentXPosition, int maxHeightForNeumes) {
        StringJoiner stringJoiner = new StringJoiner("");
        Set<Integer> neumesIndices = getNeumes().keySet();
        for (Integer indice : neumesIndices) {
            Neume neume = getNeumes().get(indice);
            stringJoiner.add(neume.getNeumeSVG(textLinePositions, indiceInSentence, currentXPosition, maxHeightForNeumes));
            currentXPosition = neume.getXStart();
        }

        return stringJoiner.toString();
    }

    public int getXStart() {
        int xStart = Integer.MAX_VALUE;
        for (Integer indice : neumes.keySet()) {
            Neume neume = neumes.get(indice);
            if (neume.getXStart() < xStart) {
                xStart = neume.getXStart();
            }
        }
        return xStart;
    }

    public int getXEnd() {
        int xEnd = 0;
        for (Integer indice : neumes.keySet()) {
            Neume neume = neumes.get(indice);
            if (neume.getXEnd() > xEnd) {
                xEnd = neume.getXEnd();
            }
        }
        return xEnd;
    }

    public int getLength() {
        int maxLength = 0;
        for (Integer indice : neumes.keySet()) {
            Neume neume = neumes.get(indice);
            if (neume.getLengthWithWordSpaceCorrection() > maxLength) {
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
        for (Integer indice : neumes.keySet()) {
            Neume neume = neumes.get(indice);
            if (neume.isUnspoken()) return true;
        }
        return false;
    }

    public int getSpaceWithNextNeume() {
        int xSpace = 0;
        for (Integer indice : neumes.keySet()) {
            Neume neume = neumes.get(indice);
            if (neume.getXSpace() > xSpace) {
                xSpace = neume.getXSpace();
            }
        }
        return xSpace;
    }

    public int getHeight() {
        int height = 0;
        for (Integer indice : neumes.keySet()) {
            Neume neume = neumes.get(indice);
            if (neume.getHeight() > height) {
                height = neume.getHeight();
            }
        }
        return height;
    }

    public int getLengthWithSpace() {
        return getLength() + getSpaceWithNextNeume();
    }
}
