package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Klasma extends Neume  {

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int currentXPosition) {
        this.xStart = currentXPosition + 1000;
        return "<path klasma d=\"M" + (currentXPosition + 1000) + " 515 c-4 -9 -1 -34 6 -55 11 -34 11 -42 -4 -64 -20 -32 -51 -40 -130 -34 -70 6 -98 18 -213 96 -83 55 -113 61 -113 24 0 -25 49 -62 153 -117 131 -70 196 -87 302 -83 103 4 139 18 172 67 29 42 29 71 2 105 -41 52 -162 95 -175 61z\"/>";
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public String toString() {
        return "Klasma{}";
    }

}
