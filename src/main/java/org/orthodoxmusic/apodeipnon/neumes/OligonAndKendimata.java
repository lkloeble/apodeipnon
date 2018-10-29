package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class OligonAndKendimata extends Neume {

    private static int OLIGON_AND_KENDIMATA_LENGTH = 71;

    public OligonAndKendimata() {
        height = 28 + getHeightCorrection();
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13 + getHeightCorrection();
        return "<image oligon x=\"" + currentXPosition + "\" y=\"" + y + "\"  width=\"71.68\" height=\"27.84\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 \"/>\n";
    }

    @Override
    public int getGorgonCorrection() {
        return getLength()/2 - 40;
    }

    @Override
    public int getHeightCorrection() {
        return 11;
    }

    @Override
    public int getLength() {
        return OLIGON_AND_KENDIMATA_LENGTH;
    }

    @Override
    public String toString() {
        return "OligonAndKendimata{}";
    }


}
