package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class TriAscendingOligon extends Neume {

    private static int TRI_ASCENDING_OLIGON_LENGTH = 71;

    public TriAscendingOligon() {
        height = 26;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        return "<image oligon+3 x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"71.36\" height=\"26.24\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 \"/>\n";
    }

    @Override
    public int getLength() {
        return TRI_ASCENDING_OLIGON_LENGTH;
    }

    @Override
    public String toString() {
        return "TriAscendingOligon{}";
    }

}
