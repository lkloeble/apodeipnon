package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class AscendingTwoOligonAndKendimata extends Neume {

    private static int ASCENDING_TWO_OLIGON_AND_KENDIMATA_LENGTH = 88;

    public AscendingTwoOligonAndKendimata() {
        xSpaceBetweenNeume = 15;
        height = 28;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        return "<image oligon+2+kendimata x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"88\" height=\"28.16\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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  \"/>\n";
    }

    @Override
    public int getGorgonCorrection() {
        return getLength()/2 - 40;
    }

    @Override
    public int getHeightCorrection() {
        return 10;
    }

    @Override
    public int getLength() {
        return ASCENDING_TWO_OLIGON_AND_KENDIMATA_LENGTH;
    }

    @Override
    public String toString() {
        return "AscendingTwoOligonAndKendimata{}";
    }



}
