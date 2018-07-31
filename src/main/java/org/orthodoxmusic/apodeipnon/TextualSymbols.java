package org.orthodoxmusic.apodeipnon;

import org.orthodoxmusic.apodeipnon.letters.french.Letter;

import java.util.*;


public class TextualSymbols {

    private Map<Integer,Letter> letters = new HashMap<Integer, Letter>();

    public void addLetter(Letter letter) {
        int currentPosition = getCurrentPosition();
        System.out.println("on demande l'ajout de " + letter.getLetterName() + " apres " + currentPosition);
        letters.put(++currentPosition,letter);
    }

    private int getCurrentPosition() {
        return getMax(letters.keySet());
    }

    private int getMax(Set<Integer> integerSet) {
        int max = 0;
        for(Integer integer : integerSet) {
            if(max < integer) {
                max = integer;
            }
        }
        return max;
    }

    public void printlog() {
        StringBuilder stringBuilder = new StringBuilder("Lettres : ");
        List<Integer> orderedPositions = new ArrayList<Integer>(letters.keySet());
        Collections.sort(orderedPositions);
        for(Integer position : orderedPositions) {
            stringBuilder.append(letters.get(position).getLetterName());
        }
        System.out.print(stringBuilder);
    }
}
