package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Pause1 extends Neume {

    private static int PAUSE_1T_LENGTH = 60;

    public Pause1() {
        xSpaceBetweenNeume = 15;
        height = 39;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        return "<image elaphron x=\"" + currentXPosition + "\" y=\""  + y + "\" width=\"59.84\" height=\"39.36\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 \"/>\n";
    }

    @Override
    public int getLength() {
        return PAUSE_1T_LENGTH;
    }

    @Override
    public String toString() {
        return "Pause1{}";
    }

}
