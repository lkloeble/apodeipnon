package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class KendimataAndOligon extends Neume {

    private static int KENDIMATA_AND_OLIGON_LENGTH = 71;

    public KendimataAndOligon() {
        height = 27;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 26;
        return "<image kendimata+oligon x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"71.36\" height=\"27.2\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 \"/>\n";
    }

    @Override
    public int getLength() {
        return KENDIMATA_AND_OLIGON_LENGTH;
    }

    @Override
    public int getGorgonCorrection() {
        return -12;
    }

    @Override
    public String toString() {
        return "KendimataAndOligon{}";
    }


}
