package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class ApostrosAndElaphron extends Neume {

    private static int APOSTROPHOS_AND_ELAPHRON_LENGTH = 55;

    public ApostrosAndElaphron() {
        xSpaceBetweenNeume = 15;
        height = 20;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        return "<image apostrophos+elaphron x=\"" + currentXPosition + "\" y=\""  + y + "\"  width=\"55.04\" height=\"20.16\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 SUVORK5CYII= \"/>\n";
    }

    @Override
    public int getLength() {
        return APOSTROPHOS_AND_ELAPHRON_LENGTH;
    }

    @Override
    public String toString() {
        return "ApostrophosAndElaphron{}";
    }


}
