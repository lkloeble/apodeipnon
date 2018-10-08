package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class TwoBars extends Neume {

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int currentXPosition) {
        this.xStart = currentXPosition;
        return "<path fill=\"#ff0000\" redbar d=\"M" + currentXPosition + " 621 c0 -205 1 -211 20 -211 20 0 20 5 18 207 -3 189 -5 208 -20 211 -17 3 -18 -12 -18 -207z\"/>\n" +
                "<path fill=\"#ff0000\" redbar d=\"M" + (currentXPosition+125) + " 818 c-3 -7 -4 -101 -3 -208 3 -187 4 -195 23 -195 19 0 20 7 20 205 0 187 -2 205 -18 208 -9 2 -19 -3 -22 -10z\"/>\n";
    }

    @Override
    public boolean isUnspoken() {
        return true;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public String toString() {
        return "Redbars{}";
    }

}
