package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class OligonAndApostrophos extends Neume {

    private static int OLIGON_AND_APOSTROPHOS_LENGTH = 71;

    public OligonAndApostrophos() {
        height = 29;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        return "<image oligonAndApostrophos x=\"" + currentXPosition + "\" y=\"" + y + "\"  width=\"71.36\" height=\"28.48\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 \"/>\n";
    }

    @Override
    public int getLength() {
        return OLIGON_AND_APOSTROPHOS_LENGTH;
    }

    @Override
    public String toString() {
        return "OligonAndApostrophos{}";
    }



}
