package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Petastie extends Neume {

    private static int PETASTIE_LENGTH = 52;

    public Petastie() {
        height = 19;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        int y = maxHeight - height + 13;
        int wordUnderNeumeLength = textLinePositions.getLengthForThisWord(positionInSentence);
        if(wordUnderNeumeLength > getLength()) {
            lengthCorrection = (wordUnderNeumeLength - PETASTIE_LENGTH)*2;
            currentXPosition += lengthCorrection;
            xSpaceBetweenNeume += lengthCorrection;
        }
        this.xStart = currentXPosition;
        return "<image petastie x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"52.48\" height=\"19.52\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 n/hACAAAAABJRU5ErkJggg== \"/>\n";
    }

    @Override
    public int getLength() {
        return PETASTIE_LENGTH;
    }

    public int getKlasmaCorrection() {
        return getLength()/2 - 10;
    }

    @Override
    public String toString() {
        return "Petastie{}";
    }
}
