package org.orthodoxmusic.apodeipnon;

import javafx.scene.shape.SVGPath;

import java.util.ArrayList;
import java.util.List;

public class UserInputList {

    private List<UserInput> userInputs = new ArrayList<UserInput>();

    public void addUserInput(UserInput userInput) {
        userInputs.add(userInput);
    }

    public void eraseLastUserInput() {
        userInputs.remove(getLastIndex());
    }

    public List<SVGPath> getAllSVGPathes() {
        List<SVGPath> svgPathList = new ArrayList<SVGPath>();
        for(UserInput userInput : userInputs) {
            svgPathList.add(userInput.getSvgPath());
        }
        return svgPathList;
    }

    private int getLastIndex() {
        return userInputs.size()-1;
    }

    public int getCurrentX() {
        int currentX = 0;
        int maxY = getMaxY();
        for(UserInput userInput : userInputs) {
            if(userInput.getNeume().getCurrentY() < maxY) continue;
            currentX += userInput.getNeume().getHorizontalSpace();
        }
        return currentX;
    }

    private int getMaxY() {
        int maxY = 0;
        for(UserInput userInput : userInputs) {
            if(userInput.getNeume().getCurrentY() > maxY) {
                maxY =userInput.getNeume().getCurrentY();
            }
        }
        return maxY;
    }
}
