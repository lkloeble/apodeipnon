package org.orthodoxmusic.apodeipnon.svg;

import org.orthodoxmusic.apodeipnon.Path;

import java.util.ArrayList;
import java.util.List;

public class SVGPathPointsList {

    private static final char END_PATH_CHAR = 'z';

    private List<SVGPathPoints> list = new ArrayList<>();

    private SVGPathPointsList(List<SVGPathPoints> list) {
        this.list = list;
    }

    public SVGPathPointsList() {;}

    public void addNewLetter(char c) {
        if(letterIsAuthorized(c)) {
            int indiceOfLetter = getIndiceOfLetter(c);
            list.add(new SVGPathPoints(c,indiceOfLetter));
        }
    }

    private int getIndiceOfLetter(char c) {
        int indiceOfLetter = 0;
        for(SVGPathPoints points : list) {
            if(points.getLetter() == c) indiceOfLetter++;
        }
        return indiceOfLetter;
    }

    private boolean letterIsAuthorized(char c) {
        return c != END_PATH_CHAR;
    }

    /*
    private boolean letterAlreadyExists(char c) {
        for(SVGPathPoints points : list) {
            if(points.getLetter() == c) {
                return true;
            }
        }
        return false;
    }
    */

    public int size() {
        return list.size();
    }

    public void putPathPortionForLetter(char currentChar, String pathDescription) {
        SVGPathPoints pointsForThisLetter = getPointsForThisLetter(currentChar, getIndiceForThisLetter(currentChar));
        if(pointsForThisLetter != null) pointsForThisLetter.addPoints(pathDescription);
    }

    private int getIndiceForThisLetter(char currentChar) {
        int highestIndiceFound = 0;
        for(SVGPathPoints points : list) {
            if(points.getLetter() == currentChar) {
                int possibleIndice = points.getIndice();
                if(possibleIndice > highestIndiceFound) {
                    highestIndiceFound = possibleIndice;
                }
            }
        }
        return highestIndiceFound;
    }

    private SVGPathPoints getPointsForThisLetter(char currentChar, int indiceOfLetter) {
        for(SVGPathPoints points : list) {
            if(points.getLetter() == currentChar && points.getIndice() == indiceOfLetter) return points;
        }
        return null;
    }

    @Override
    public String toString() {
        return "SVGPathPointsList{" +
                "list=" + list +
                '}';
    }

    public short getNumberOfInformations(char letter) {
        for(SVGPathPoints points : list) {
            if(points.getLetter() == letter) return points.getNumberOfPoints();
        }
        return 0;
    }

    public List<SVGPathPoints> getList() {
        return list;
    }

    public SVGPathPointsList translateOnlyLeft(float translation) {
        List<SVGPathPoints> pointsListTranslated = new ArrayList<>();
        for(SVGPathPoints points : list) {
            pointsListTranslated.add(points.translateOnlyLeft(translation));
        }
        return new SVGPathPointsList(pointsListTranslated);
    }

    public SVGPathPointsList translateOnlyLeftForSelectedLetter(float translation, char letterOnly) {
        List<SVGPathPoints> pointsListTranslated = new ArrayList<>();
        for(SVGPathPoints points : list) {
            pointsListTranslated.add(points.translateOnlyLeftForSelectedLetter(translation,letterOnly));
        }
        return new SVGPathPointsList(pointsListTranslated);
    }

    public SVGPathPointsList translateOnlyLeftForSelectedLetters(float translation, List<String> chars) {
        List<SVGPathPoints> pointsListTranslated = new ArrayList<>();
        for(SVGPathPoints points : list) {
            pointsListTranslated.add(points.translateOnlyLeftForSelectedLetters(translation,chars));
        }
        return new SVGPathPointsList(pointsListTranslated);
    }
}
