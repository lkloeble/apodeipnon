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
        stringBuilder.append(" (").append(getGraphicalSize())
                .append(" From ").append(getStartXIndice())
                .append(" To ").append(getLastXPosition()).append(")");
        System.out.print(stringBuilder);
    }

    private double getStartXIndice() {
        double startXIndice = Integer.MAX_VALUE;
        for(Letter letter : letters.values()) {
            if(letter.getCurrentX() < startXIndice) {
                startXIndice = letter.getCurrentX();
            }
        }
        return startXIndice;
    }

    public int getGraphicalSize() {
        int graphicalSize = 0;
        for(Letter letter : letters.values()) {
            graphicalSize += letter.getGraphicalSize();
        }
        return graphicalSize;
    }

    public double getLastXPosition() {
        return getStartXIndice() + getGraphicalSize();
    }

    public void drawCenter(Group group, double graphicalSize) {
        System.out.println("je centre les lettres sur " + graphicalSize);
        double shift = (graphicalSize - getGraphicalSize()) / 2;
        Collection<Letter> values = new ArrayList<>(letters.values());
        for(Letter letter : values) {
            Letter oldLetter = letter;
            Letter letterWithShifting = letter.getLetterWithShifting(shift);
            System.out.println("letter " + oldLetter + " devient " + letterWithShifting);
            group.getChildren().add(letterWithShifting.getSvgPath());
        }
    }

    public void draw(Group group) {
        Collection<Letter> values = letters.values();
        for(Letter letter : values) {
            group.getChildren().add(letter.getSvgPath());
        }
    }

}
