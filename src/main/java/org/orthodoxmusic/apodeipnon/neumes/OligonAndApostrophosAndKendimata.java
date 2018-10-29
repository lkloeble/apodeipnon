package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class OligonAndApostrophosAndKendimata extends Neume {

    private static int OLIGON_AND_APOSTROPHOS_AND_KENDIMATA_LENGTH = 76;

    public OligonAndApostrophosAndKendimata() {
        height = 29;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        return "<image oligon x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"76.16\" height=\"29.44\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 \"/>\n";
    }

    @Override
    public int getGorgonCorrection() {
        return getLength()/2 - 25;
    }

    @Override
    public int getLength() {
        return OLIGON_AND_APOSTROPHOS_AND_KENDIMATA_LENGTH;
    }

    @Override
    public String toString() {
        return "OligonAndApostrophosAndKendimata{}";
    }



}
