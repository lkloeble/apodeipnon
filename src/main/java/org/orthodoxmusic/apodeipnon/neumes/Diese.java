package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Diese extends Neume {

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int currentXPosition) {
        this.xStart = currentXPosition + 400;
        return "<path fill=\"#ff0000\" diese d=\"M" + (currentXPosition + 400) + " -100 l-76 -77 -43 17 c-65 26 -120 15 -169 -34 -50 -50 -61 -107 -32 -172 27 -61 72 -88 147 -88 55 0 60 2 101 44 41 41 44 47 44 99 0 31 -5 68 -12 82 -11 25 -8 30 71 104 77 72 93 101 58 101 -7 0 -47 -34 -89 -76z m-118 -100 c37 -22 60 -64 60 -109 0 -30 -8 -45 -39 -76 -32 -32 -46 -39 -77 -39 -95 0 -153 96 -109 180 29 56 109 77 165 44z\"/>\n";
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public String toString() {
        return "Diese{}";
    }


}
