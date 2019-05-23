package org.orthodoxmusic.apodeipnon;

import org.orthodoxmusic.apodeipnon.svg.SVGPathPoints;
import org.orthodoxmusic.apodeipnon.svg.SVGPathPointsList;

import java.util.ArrayList;
import java.util.List;


public class Path {

    private String path;
    private SVGPathPointsList svgPathPointsList = new SVGPathPointsList();

    public Path(String pathFromSvgFile) {
        this.path=pathFromSvgFile;
        affectData();
    }

    public String getPath() {
        return path;
    }

    private void affectData() {
        svgPathPointsList = getPathPointsList(path);
    }

    private SVGPathPointsList getPathPointsList(String pathDescription) {
        char[] charArray = path.toCharArray();
        StringBuilder currentPathPortion = new StringBuilder();
        SVGPathPointsList svgPathPointsList = new SVGPathPointsList();
        char currentChar = '@';
        for(char c : charArray) {
            if(isNotALatterOfSVGCommand(c)) {
                currentPathPortion.append(c);
            } else {
                if(currentPathPortion.length() > 0) {
                    svgPathPointsList.putPathPortionForLetter(currentChar,currentPathPortion.toString());
                }
                currentChar = c;
                svgPathPointsList.addNewLetter(c);
                currentPathPortion = new StringBuilder();
            }
        }
        return svgPathPointsList;
    }

    private boolean isNotALatterOfSVGCommand(char c) {
        int charValue = (int)c;
        return charValue < 65;
    }

    public int numberOfCommand() {
        return svgPathPointsList.size();
    }

    public short getNumberOfInstructionsForLetter(char letter) {
        return svgPathPointsList.getNumberOfInformations(letter);
    }

    public Path translateOnlyLeft(float translation) {
        return new Path(getFullPathFromData(svgPathPointsList.translateOnlyLeft(translation)));
    }

    public Path translateOnlyLeftForSelectedLetter(float translation, char letterOnly) {
        return new Path(getFullPathFromData(svgPathPointsList.translateOnlyLeftForSelectedLetter(translation,letterOnly)));
    }

    public Path translateOnlyLeftForSelectedLetters(float translation, List<Character> chars) {
        List<String> charStrings = new ArrayList<>();
        for(Character c : chars) {
            charStrings.add(c.toString());
        }
        return new Path(getFullPathFromData(svgPathPointsList.translateOnlyLeftForSelectedLetters(translation,charStrings)));
    }

    private String getFullPathFromData(SVGPathPointsList pathPointsList) {
        StringBuilder stringBuilder = new StringBuilder();
        for(SVGPathPoints pointsList : pathPointsList.getList()) {
            stringBuilder.append(pointsList.getFullPathFromData());
        }
        stringBuilder.append("z");
        return stringBuilder.toString();
    }

}
