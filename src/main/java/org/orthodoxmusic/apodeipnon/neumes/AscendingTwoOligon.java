package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class AscendingTwoOligon extends Neume {

    private static int ASCENDING_TWO_OLIGON_LENGTH = 88;

    public AscendingTwoOligon() {
        xSpaceBetweenNeume = 15;
        height = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        int wordUnderNeumeLength = textLinePositions.getLengthForThisWord(positionInSentence);
        if(wordUnderNeumeLength > getLength()) {
            lengthCorrection = (wordUnderNeumeLength - ASCENDING_TWO_OLIGON_LENGTH)*2;
            currentXPosition += lengthCorrection;
            xSpaceBetweenNeume += lengthCorrection;
        }
        return "<image oligon+2 x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"88\" height=\"15.04\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 \"/>\n";
    }

    @Override
    public int getKlasmaCorrection() {
        return getLength()/2 -15;
    }

    @Override
    public int getLength() {
        return ASCENDING_TWO_OLIGON_LENGTH;
    }

    @Override
    public String toString() {
        return "AscendingTwoOligon{}";
    }


}
