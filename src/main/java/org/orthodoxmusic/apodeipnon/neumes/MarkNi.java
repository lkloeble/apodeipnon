package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class MarkNi  extends Neume {

    private static final Integer NI_MARK_LENGTH = 20;

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - 13;
        return "<image markni x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"19.84\" height=\"40.64\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 RK5CYII= \"/>\n";
    }

    @Override
    public boolean isUnspoken() {
        return true;
    }

    @Override
    public int getLength() {
        return NI_MARK_LENGTH;
    }

    @Override
    public String toString() {
        return "Mark NI{}";
    }


}
