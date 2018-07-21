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

    //TODO : calculate real currentX
    public int getCurrentX() {
        return 0;
    }
}
