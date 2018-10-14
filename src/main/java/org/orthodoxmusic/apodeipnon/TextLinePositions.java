package org.orthodoxmusic.apodeipnon;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class TextLinePositions {

    private Map<Integer, String> orderAndWidthMap = new HashMap<>();

    public void setOrderAndWidthMap(Map<Integer,String> words) {
        for(Integer indice : words.keySet()) {
            setOrderAndWidthMap(indice,words.get(indice));
        }
    }

    private void setOrderAndWidthMap(int orderInSentence, String wordUnderNeume) {
        orderAndWidthMap.put(orderInSentence,wordUnderNeume);
    }

    public int getLengthForThisWord(int currentPosition) {
        String wordForPosition = orderAndWidthMap.get(currentPosition);
        if(wordForPosition == null) {
            return 0;
        }
        wordForPosition = dontBotherWithPonctuation(wordForPosition);
        wordForPosition = doubleUpperCase(wordForPosition);
        return wordForPosition.length() * 15;
    }

    private String dontBotherWithPonctuation(String word) {
        return word.replace(".","").replace(",","");
    }

    private String doubleUpperCase(String word) {
        StringJoiner stringJoiner = new StringJoiner("");
        char[] allLetters = word.toCharArray();
        for(char c : allLetters) {
            char element = c;
            if(element < 'a' || element == 'm') {
                stringJoiner.add(Character.toString(element));
            }
            stringJoiner.add(Character.toString(element));
        }
        return stringJoiner.toString();
    }

}
