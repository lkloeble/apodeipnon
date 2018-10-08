package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Oligon extends Neume {

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int currentXPosition) {
        this.xStart = currentXPosition;
        return "<path oligon d=\"M" + currentXPosition + " 233 c-25 -25 53 -126 127 -166 l41 -22 785 -5 c706 -4 789 -7 822 -22 31 -14 39 -14 48 -3 15 19 -7 58 -62 112 -85 83 -25 77 -908 83 -602 4 -790 8 -807 18 -24 14 -37 15 -46 5z\"/>\n";
    }

    @Override
    public int getLength() {
        return 2100;
    }

    @Override
    public String toString() {
        return "Oligon{}";
    }
}
