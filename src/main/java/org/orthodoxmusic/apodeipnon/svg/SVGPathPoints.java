package org.orthodoxmusic.apodeipnon.svg;

import java.util.ArrayList;
import java.util.List;

public class SVGPathPoints {

    private String letter;
    private int indiceOfLetter;
    private List<SVGPathPoint> pointList = new ArrayList<>();

    public SVGPathPoints(char letterChar, int indiceOfLetter) {
        this.letter = Character.toString(letterChar);
        this.indiceOfLetter = indiceOfLetter;
    }

    private SVGPathPoints(String letter, List<SVGPathPoint> pointList) {
        this.letter = letter;
        this.pointList = pointList;
    }

    public void addPoints(String pathDescription) {
        String[] pointsToAdd = pathDescription.split(" ");
        for(String pointToAdd : pointsToAdd) {
            if(!canBeAdded(pointToAdd)) continue;
            pointList.add(new SVGPathPoint(pointToAdd.trim()));
        }
    }

    private boolean canBeAdded(String pointToAdd) {
        return pointToAdd != null && pointToAdd.trim() != null && pointToAdd.trim().length() > 0;
    }

    public char getLetter() {
        return letter.charAt(0);
    }

    @Override
    public String toString() {
        return "SVGPathPoints{" +
                "letter='" + letter + '\'' +
                "indice='" + indiceOfLetter + '\'' +
                ", pointList=" + pointList +
                '}';
    }

    public short getNumberOfPoints() {
        return (short)pointList.size();
    }

    public String getFullPathFromData() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(letter).append(" ");
        for(SVGPathPoint point : pointList) {
            stringBuilder.append(point.getFullPathFromData()).append(" ");
        }
        return stringBuilder.toString();
    }

    public SVGPathPoints translateOnlyLeft(float translation) {
        List<SVGPathPoint> pointListTranslated = new ArrayList<>();
        for(SVGPathPoint svgPathPoint : pointList) {
            pointListTranslated.add(svgPathPoint.translateLeft(translation));
        }
        return new SVGPathPoints(letter,pointListTranslated);
    }

    public SVGPathPoints translateOnlyLeftForSelectedLetter(float translation, char letterOnly) {
        List<SVGPathPoint> pointListTranslated = new ArrayList<>();
        for(SVGPathPoint svgPathPoint : pointList) {
            if(letter.equals(Character.toString(letterOnly))) {
                pointListTranslated.add(svgPathPoint.translateLeft(translation));
            } else {
                pointListTranslated.add(svgPathPoint);
            }
        }
        return new SVGPathPoints(letter,pointListTranslated);
    }

    public SVGPathPoints translateOnlyLeftForSelectedLetters(float translation, List<String> chars) {
        List<SVGPathPoint> pointListTranslated = new ArrayList<>();
        for(SVGPathPoint svgPathPoint : pointList) {
            if(chars.contains(letter)) {
                pointListTranslated.add(svgPathPoint.translateLeft(translation));
            } else {
                pointListTranslated.add(svgPathPoint);
            }
        }
        return new SVGPathPoints(letter,pointListTranslated);
    }

    public int getIndice() {
        return indiceOfLetter;
    }
}
