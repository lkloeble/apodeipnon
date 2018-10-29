package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class TriAscendingPetastie extends Neume {

    private static int TRI_ASCENDING_PETASTIE_LENGTH = 52;

    public TriAscendingPetastie() {
        height = 31;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        return "<image petastie+3 x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"52.48\" height=\"31.04\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 Tu1awb9+eHMCDp0GewAAAABJRU5ErkJggg== \"/>\n";
    }

    @Override
    public int getLength() {
        return TRI_ASCENDING_PETASTIE_LENGTH;
    }

    public int getKlasmaCorrection() {
        return getLength()/2 - 10;
    }

    @Override
    public String toString() {
        return "TriAscendingPetastie{}";
    }


}
