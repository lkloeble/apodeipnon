package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class DiAscendingPetastie extends Neume {

    private static int PETASTIE_WITH_OLIGON_LENGTH = 52;

    public DiAscendingPetastie() {
        height = 35;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        return "<image petastie+1 x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"71.36\" height=\"34.88\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 \"/>";
    }

    @Override
    public int getLength() {
        return PETASTIE_WITH_OLIGON_LENGTH;
    }

    @Override
    public String toString() {
        return "PetastieWithOligon{}";
    }

}
