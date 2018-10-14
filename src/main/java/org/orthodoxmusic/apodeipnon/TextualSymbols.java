package org.orthodoxmusic.apodeipnon;

import org.orthodoxmusic.apodeipnon.letters.french.Letter;

import java.util.*;


public class TextualSymbols {

    private static final Integer DEFAULT_Y_POSITION = 70;
    private static final String EMPTY_WORD_FOR_UNSPOKEN_NEUME = " ";

    private Map<Integer, String> words = new HashMap<Integer, String>();

    public void addText(String content) {
        StringTokenizer stringTokenizer = new StringTokenizer(content);
        while (stringTokenizer.hasMoreTokens()) {
            words.put(getNextIndice(), stringTokenizer.nextToken());
        }
    }

    private int getNextIndice() {
        return words.size() + 1;
    }

    public List<String> getWords() {
        return new ArrayList<>(words.values());
    }

    public String getSvgData(NeumesLinePositions neumesLinePositions) {
        return getData(neumesLinePositions);
    }


    public int size() {
        return words.size();
    }

    public String getData(NeumesLinePositions neumesLinePositions) {
        StringJoiner stringJoiner = new StringJoiner("");
        for (Integer currentPosition : words.keySet()) {
            int currentWordXCenterPosition = neumesLinePositions.getXPosition(currentPosition);
            String word = words.get(currentPosition);
            int currentWordXPosition = getLeftPositionFromCenterAndlength(currentWordXCenterPosition, word);
            String textPath = "<text x=\"" + currentWordXPosition + "\" y=\"" + (DEFAULT_Y_POSITION +  neumesLinePositions.getNeumeHeight()) + "\" fill=\"black\" font-size=\"40\">" + htmlEntites(word) + "</text>\n";
            stringJoiner.add(textPath);
            currentPosition++;
        }
        return stringJoiner.toString();
    }

    private String htmlEntites(String word) {
        StringJoiner stringJoiner = new StringJoiner("");
        char[] chars = word.toCharArray();
        for(char c : chars) {
            int i = (int)c;
            if(i == 32) {
                stringJoiner.add(" ");
            }
            stringJoiner.add("&#").add(Integer.toString(i)).add(";");
        }
        return stringJoiner.toString();
    }

    private int getLeftPositionFromCenterAndlength(int currentWordXCenterPosition, String word) {
        return currentWordXCenterPosition - (word.length() - 1) * 9;
    }

    public TextLinePositions getPositions() {
        TextLinePositions textLinePositions = new TextLinePositions();
        textLinePositions.setOrderAndWidthMap(words);
        return textLinePositions;
    }

    public void insertSpacesForUnspokenNeumes(List<Integer> unSpokenNeumesPositionsIndices) {
        Map<Integer,String> newWords = new HashMap<>();
        int newIndice = 1;
        for(Integer indice : words.keySet()) {
            if(unSpokenNeumesPositionsIndices.contains(indice)) {
                newWords.put(newIndice,EMPTY_WORD_FOR_UNSPOKEN_NEUME);
                newIndice++;
            }
            newWords.put(newIndice,words.get(indice));
            newIndice++;
        }
        words = newWords;
    }
}
