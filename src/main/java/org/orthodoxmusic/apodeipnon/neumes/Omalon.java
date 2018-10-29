package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Omalon extends Neume {

    private static int OMALON_LENGTH = 71;

    public Omalon() {
        xSpaceBetweenNeume = 0;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight + 31;
        return "<image omalon x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"71.36\" height=\"19.52\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 RK5CYII= \"/>\n";
    }

    @Override
    public int getLength() {
        return OMALON_LENGTH;
    }

    @Override
    public String toString() {
        return "Omalon{}";
    }


}
