package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Diese4 extends Neume {

    private static int DIESE4_LENGTH = 0;

    private Neume neumeWithDiese;

    public Diese4(Neume neumeWithDiese) {
        this.neumeWithDiese=neumeWithDiese;
        xSpaceBetweenNeume = 15;
    }

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 14;
        currentXPosition += neumeWithDiese.getDieseCorrection() -5;
        return "<image diese4 x=\"" + (currentXPosition+30) + "\" y=\"" + y + "\" width=\"33.6\" height=\"22.72\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 \"/>\n";
    }

    @Override
    public int getLength() {
        return DIESE4_LENGTH;
    }

    @Override
    public String toString() {
        return "Diese4{}";
    }
}
