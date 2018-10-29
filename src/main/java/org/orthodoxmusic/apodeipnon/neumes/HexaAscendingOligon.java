package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class HexaAscendingOligon extends Neume {

    private static int HEXA_ASCENDING_OLIGON_LENGTH = 82;

    public HexaAscendingOligon() {
        xSpaceBetweenNeume = 15;
        height = 49;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        return "<image oligon+4 x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"81.6\" height=\"49.28\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 rkJggg== \"/>\n";
    }

    @Override
    public int getLength() {
        return HEXA_ASCENDING_OLIGON_LENGTH;
    }

    @Override
    public String toString() {
        return "HexaAscendingOligon{}";
    }


}
