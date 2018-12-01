package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Elaphron extends Neume {

    private static int ELAPHRON_LENGTH = 55;

    public Elaphron() {
        xSpaceBetweenNeume = 15;
        height = 19;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        return "<image elaphron x=\"" + currentXPosition + "\" y=\""  + y + "\" width=\"55.04\" height=\"19.2\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 \"/>\n";
    }

    @Override
    public int getLength() {
        return ELAPHRON_LENGTH;
    }

    @Override
    public int getKlasmaCorrection() {
        return +4;
    }

    @Override
    public int getGorgonCorrection() {
        return getLength()/2 - 10;
    }

    @Override
    public int getUnderGorgonCorrection() {
        return getLength() - 70;
    }

    @Override
    public int getDiplieCorrection() {
        return 10;
    }

    @Override
    public String toString() {
        return "Elaphron{}";
    }

}
