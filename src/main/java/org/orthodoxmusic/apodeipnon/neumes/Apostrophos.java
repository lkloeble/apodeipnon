package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Apostrophos extends Neume {

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int currentXPosition) {
        this.xStart = currentXPosition;
        return "<path apostrophos d=\"M" + currentXPosition + " 481 c-14 -22 4 -28 101 -35 54 -4 139 -15 188 -25 232 -48 335 -129 305 -240 -14 -52 -71 -117 -110 -126 -35 -8 -48 -24 -29 -36 21 -13 186 -11 232 3 22 7 55 26 73 44 30 27 34 38 34 81 0 138 -165 248 -470 313 -118 25 -314 38 -324 21z\"/>\n";
    }

    @Override
    public int getLength() {
        return 1000;
    }

    @Override
    public String toString() {
        return "Apostrophos{}";
    }
}
