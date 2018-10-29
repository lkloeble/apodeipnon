package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class PetastieAndApostrophos extends Neume {

    private static int PETASTIE_ISON_LENGTH = 52;

    public PetastieAndApostrophos() {
        height = 33;
        xSpaceBetweenNeume = 15;
    }

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        return "<image petastie+apostrophos x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"52.48\" height=\"33.28\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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  \"/>\n";
    }

    public int getKlasmaCorrection() {
        return getLength()/2 - 5;
    }


    @Override
    public int getLength() {
        return PETASTIE_ISON_LENGTH;
    }

    @Override
    public String toString() {
        return "PetastieAndApostrophos{}";
    }

}
