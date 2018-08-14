package org.orthodoxmusic.apodeipnon;

import javafx.scene.Group;
import javafx.scene.shape.SVGPath;
import org.orthodoxmusic.apodeipnon.letters.french.Letter;

import java.util.*;


public class TextualSymbols {

    private Map<Integer,Letter> letters = new HashMap<Integer, Letter>();

    public void addLetter(Letter letter) {
        int currentPosition = getCurrentPosition();
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

    public void draw(Group group) {
        Collection<Letter> values = letters.values();
        for(Letter letter : values) {
            group.getChildren().add(letter.getSvgPath());
        }
    }

    public int getGraphicalSize() {
        int graphicalSize = 0;
        for(Letter letter : letters.values()) {
            graphicalSize += letter.getGraphicalSize();
        }
        return graphicalSize;
    }

    public double getLastXPosition() {
        int higherIndice = getHigherIndice();
        if(higherIndice > 0) {
            Letter mostRightLetter = letters.get(higherIndice);
            return mostRightLetter.getCurrentX();
        }
        return 0;
    }

    private int getHigherIndice() {
        int higherIndice = 0;
        for(Integer indice : letters.keySet()) {
            if(indice > higherIndice) {
                higherIndice = indice;
            }
        }
        return higherIndice;
    }
}
