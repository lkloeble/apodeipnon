package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class NullNeume extends Neume {

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int horizontalIndice, int maxHeight) {

        return "<svg width=\"100\" height=\"100\">\n" +
                "  <circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"green\" stroke-width=\"4\" fill=\"yellow\" />\n" +
                "</svg>";
    }

    @Override
    public int getLength() {
        return 0;
    }
}
