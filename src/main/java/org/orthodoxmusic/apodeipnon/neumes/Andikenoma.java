package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Andikenoma extends Neume {

    private static int ANDIKENOMA_LENGTH = 81;

    public Andikenoma() {
        height = 13;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 28;
        return "<image andikenoma x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"81.6\" height=\"13.12\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 C+kcCJznUDd3AAAAAElFTkSuQmCC \"/>\n";
    }

    @Override
    public int getLength() {
        return ANDIKENOMA_LENGTH;
    }

    public int getKlasmaCorrection() {
        return getLength()/2 - 10;
    }

    @Override
    public String toString() {
        return "Andikenoma{}";
    }

}
