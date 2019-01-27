package org.orthodoxmusic.apodeipnon;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class TextLinePositions {

    private static final Integer SMALL_LOWERCASE_LETTER = 10;
    private static final Integer NORMAL_LOWERCASE_LETTER = 14;
    private static final Integer LONG_LOWERCASE_LETTER = 25;
    private static final Integer SMALL_UPPERCASE_LETTER = 22;
    private static final Integer NORMAL_UPPERCASE_LETTER = 29;
    private static final Integer LONG_UPPERCASE_LETTER = 40;

    private static Map<String, Integer> letterValues = new HashMap<>();

    static {
        letterValues.put("-",SMALL_LOWERCASE_LETTER);
        letterValues.put("!",SMALL_LOWERCASE_LETTER);
        letterValues.put(";",SMALL_LOWERCASE_LETTER);
        letterValues.put("_",NORMAL_LOWERCASE_LETTER);
        letterValues.put("a",NORMAL_LOWERCASE_LETTER);
        letterValues.put("b",NORMAL_LOWERCASE_LETTER);
        letterValues.put("c",NORMAL_LOWERCASE_LETTER);
        letterValues.put("d",NORMAL_LOWERCASE_LETTER);
        letterValues.put("e",NORMAL_LOWERCASE_LETTER);
        letterValues.put("f",NORMAL_LOWERCASE_LETTER);
        letterValues.put("g",NORMAL_LOWERCASE_LETTER);
        letterValues.put("h",NORMAL_LOWERCASE_LETTER);
        letterValues.put("i",SMALL_LOWERCASE_LETTER);
        letterValues.put("j",SMALL_LOWERCASE_LETTER);
        letterValues.put("k",NORMAL_LOWERCASE_LETTER);
        letterValues.put("l",SMALL_LOWERCASE_LETTER);
        letterValues.put("m",LONG_LOWERCASE_LETTER);
        letterValues.put("n",NORMAL_LOWERCASE_LETTER);
        letterValues.put("o",NORMAL_LOWERCASE_LETTER);
        letterValues.put("p",NORMAL_LOWERCASE_LETTER);
        letterValues.put("q",NORMAL_LOWERCASE_LETTER);
        letterValues.put("r",SMALL_LOWERCASE_LETTER);
        letterValues.put("s",NORMAL_LOWERCASE_LETTER);
        letterValues.put("t",SMALL_LOWERCASE_LETTER);
        letterValues.put("u",NORMAL_LOWERCASE_LETTER);
        letterValues.put("v",NORMAL_LOWERCASE_LETTER);
        letterValues.put("w",NORMAL_LOWERCASE_LETTER);
        letterValues.put("x",NORMAL_LOWERCASE_LETTER);
        letterValues.put("y",NORMAL_LOWERCASE_LETTER);
        letterValues.put("z",NORMAL_LOWERCASE_LETTER);
        letterValues.put("A",NORMAL_UPPERCASE_LETTER);
        letterValues.put("B",NORMAL_UPPERCASE_LETTER);
        letterValues.put("C",NORMAL_UPPERCASE_LETTER);
        letterValues.put("D",NORMAL_UPPERCASE_LETTER);
        letterValues.put("E",NORMAL_UPPERCASE_LETTER);
        letterValues.put("F",NORMAL_UPPERCASE_LETTER);
        letterValues.put("G",NORMAL_UPPERCASE_LETTER);
        letterValues.put("H",NORMAL_UPPERCASE_LETTER);
        letterValues.put("I",SMALL_UPPERCASE_LETTER);
        letterValues.put("J",SMALL_UPPERCASE_LETTER);
        letterValues.put("K",NORMAL_UPPERCASE_LETTER);
        letterValues.put("L",NORMAL_UPPERCASE_LETTER);
        letterValues.put("M",NORMAL_UPPERCASE_LETTER);
        letterValues.put("N",NORMAL_UPPERCASE_LETTER);
        letterValues.put("O",NORMAL_UPPERCASE_LETTER);
        letterValues.put("P",NORMAL_UPPERCASE_LETTER);
        letterValues.put("R",NORMAL_UPPERCASE_LETTER);
        letterValues.put("S",NORMAL_UPPERCASE_LETTER);
        letterValues.put("T",NORMAL_UPPERCASE_LETTER);
        letterValues.put("U",NORMAL_UPPERCASE_LETTER);
        letterValues.put("V",NORMAL_UPPERCASE_LETTER);
        letterValues.put("W",NORMAL_UPPERCASE_LETTER);
        letterValues.put("X",NORMAL_UPPERCASE_LETTER);
        letterValues.put("Y",NORMAL_UPPERCASE_LETTER);
        letterValues.put("Z",NORMAL_UPPERCASE_LETTER);
        letterValues.put("α",NORMAL_LOWERCASE_LETTER);
        letterValues.put("β",NORMAL_LOWERCASE_LETTER);
        letterValues.put("γ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("δ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("ε",NORMAL_LOWERCASE_LETTER);
        letterValues.put("η",NORMAL_LOWERCASE_LETTER);
        letterValues.put("θ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("ζ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("ι",SMALL_LOWERCASE_LETTER);
        letterValues.put("κ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("λ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("μ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("ν",NORMAL_LOWERCASE_LETTER);
        letterValues.put("ο",NORMAL_LOWERCASE_LETTER);
        letterValues.put("ξ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("π",NORMAL_LOWERCASE_LETTER);
        letterValues.put("ρ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("ς",NORMAL_LOWERCASE_LETTER);
        letterValues.put("σ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("τ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("υ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("φ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("χ",NORMAL_LOWERCASE_LETTER);
        letterValues.put("ω",LONG_LOWERCASE_LETTER);
    }

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
        char[] letters = wordForPosition.toCharArray();
        int wordLengthForSVG = 0;
        for(char c : letters) {
            if(c == 'ș') c = 's';
            if(c == 'ă') c = 'a';
            if(c == 'â') c = 'a';
            if(c == 'à') c = 'a';
            if(c == 'ά') c = 'a';
            if(c == 'ᾶ') c = 'a';
            if(c == 'î') c = 'i';
            if(c == 'ț') c = 't';
            if(c == 'Ţ') c = 'T';
            if(c == 'ô') c = 'o';
            if(c == 'è') c = 'e';
            if(c == 'é') c = 'e';
            if(c == 'ἐ') c = 'e';
            if(c == 'έ') c = 'e';
            if(c == 'ἡ') c = 'e';
            if(c == '\'') c = 'i';
            if(c =='Ἄ') c = 'A';
            if(c =='Ἁ') c = 'A';
            if(c =='ὁ') c = 'o';
            if(c =='ό') c = 'o';
            if(c =='Θ') c = 't';
            if(c =='Ἱ') c = 'I';
            String letter = Character.toString(c);
            if(!letterValues.containsKey(letter)) {
                System.out.println("unknown letter for length compute : " + letter);
                continue;
            }
            wordLengthForSVG += letterValues.get(letter);
        }
        return wordLengthForSVG;
    }

    private String dontBotherWithPonctuation(String word) {
        return word.replace(".","").replace(",","");
    }

}
