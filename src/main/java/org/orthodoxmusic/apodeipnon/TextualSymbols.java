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
        return integerSet.stream()
                .mapToInt(nb -> nb).max().orElse(0);
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
        return letters.values().stream().mapToInt(nb -> nb.getGraphicalSize()).sum();
    }

    public double getLastXPosition() {
        return getStartXIndice() + getGraphicalSize();
    }

    public void drawCenter(Group group, double graphicalSize) {
        double shift = (graphicalSize - getGraphicalSize()) / 2;
        letters.values().forEach(letter -> group.getChildren().add(letter.getLetterWithShifting(shift).getSvgPath()));
    }

    public void draw(Group group) {
        letters.values().stream().forEach(letter -> group.getChildren().add(letter.getSvgPath()));
    }

    public boolean isEmpty() {
        return letters.isEmpty();
    }
}
