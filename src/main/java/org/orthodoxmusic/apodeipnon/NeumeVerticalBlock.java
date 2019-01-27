package org.orthodoxmusic.apodeipnon;

import org.orthodoxmusic.apodeipnon.neumes.BasseNoteIson;
import org.orthodoxmusic.apodeipnon.neumes.Neume;
import org.orthodoxmusic.apodeipnon.neumes.NullNeume;

import java.util.*;

public class NeumeVerticalBlock {

    private Map<Integer, Neume> neumes = new HashMap<>();
    private BasseNoteIson basseNoteIson;

    public NeumeVerticalBlock(String content) {
        addNeumes(content);
    }

    private void addNeumes(String content) {
        content = extractBasseIsonIfAny(content);
        content = inversPsefestonWithPrincipalNeume(content);
        content = inversDiplieWithPrincipalNeume(content);
        content = inversAndikenomaWithPrincipalNeume(content);
        content = inversDiese4WithPrincipalNeume(content);
        content = inversDieseWithPrincipalNeume(content);
        content = affectSpecialGorgonForUnderGorgons(content);
        content = affectFollowingNeumesForUnderGorgons(content);
        content = affectSpecialKlasmaForUnderKlasma(content);
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

    private String extractBasseIsonIfAny(String content) {
        if(!content.startsWith("[")) return content;
        String[] split = content.split("]");
        basseNoteIson = new BasseNoteIson(split[0].substring(1));
        return split[1];
    }

    private String inversDiese4WithPrincipalNeume(String content) {
        return inversTargetNeumeWithPrincipalNeume(content, "dies4");
    }

    private String inversDieseWithPrincipalNeume(String content) {
        return inversTargetNeumeWithPrincipalNeume(content, "diese");
    }

    private String inversAndikenomaWithPrincipalNeume(String content) {
        return inversTargetNeumeWithPrincipalNeume(content, "andikenoma");
    }

    private String inversDiplieWithPrincipalNeume(String content) {
        return inversTargetNeumeWithPrincipalNeume(content, "diplie");
    }

    private String inversPsefestonWithPrincipalNeume(String content) {
        return inversTargetNeumeWithPrincipalNeume(content, "psefeston");
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

    private String affectSpecialKlasmaForUnderKlasma(String content) {
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


    private String inversTargetNeumeWithPrincipalNeume(String content, String targetNeume) {
        if (!content.contains(targetNeume)) return content;
        StringTokenizer psefestonTokenizer = new StringTokenizer(content, "|");
        StringJoiner stringJoinerPsefeston = new StringJoiner("|");
        while (psefestonTokenizer.hasMoreTokens()) {
            String partOfPsefestonNeume = psefestonTokenizer.nextToken();
            if (partOfPsefestonNeume.contains(targetNeume)) continue;
            stringJoinerPsefeston.add(partOfPsefestonNeume);
        }
        stringJoinerPsefeston.add(targetNeume);
        return stringJoinerPsefeston.toString().replace("klasma|"+targetNeume,targetNeume + "|klasma");
    }

    public Map<Integer, Neume> getNeumes() {
        return neumes;
    }

    public String getAllSvgData(TextLinePositions textLinePositions, int indiceInSentence, int currentXPosition, int maxHeightForNeumes) {
        StringJoiner stringJoiner = new StringJoiner("");
        Set<Integer> neumesIndices = getNeumes().keySet();
        for (Integer indice : neumesIndices) {
            Neume neume = getNeumes().get(indice);
            if(hasBassNoteIson()) {
                stringJoiner.add(basseNoteIson.getSVG(currentXPosition));
            }
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
        if(hasBassNoteIson()) {
            return "NeumeVerticalBlock{" +
                    "neumes=" + neumes +
                    " // ISON=" + basseNoteIson +
                    '}' ;
        }
        return "NeumeVerticalBlock{" +
                "neumes=" + neumes +
                '}' ;
    }

    private boolean hasBassNoteIson() {
        return basseNoteIson !=  null && basseNoteIson.hasIsonNote();
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

    public boolean hasIson() {
        return hasBassNoteIson();
    }
}
