package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Croche extends Neume {

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        return "<path croche fill=\"#ff0000\" d=\"M" + (currentXPosition+1000) + " 613 l-108 -4 0 -58 c0 -32 -3 -99 -7 -150 l-6 -92 49 3 49 3 -4 123 -3 122 155 0 c86 0 162 3 171 6 9 3 16 17 16 30 0 27 8 26 -312 17z\"/>\n";
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
        return "Croche{}";
    }

}
