package org.orthodoxmusic.apodeipnon.neumes;


import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Ison extends Neume {

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int currentXPosition) {
        this.xStart = currentXPosition;
        return "<path ison d=\"M" + currentXPosition + " 537 c-42 -21 -65 -62 -64 -115 2 -130 141 -251 338 -295 260 -58 477 -78 970 -87 353 -6 428 -10 474 -24 98 -32 108 2 26 87 -57 59 -107 90 -161 101 -17 4 -294 0 -615 -9 -600 -16 -670 -14 -770 20 -25 9 -62 29 -82 46 -29 24 -37 37 -37 64 0 38 21 59 89 89 22 11 41 24 41 31 0 31 -116 104 -165 105 -11 0 -31 -6 -44 -13z\"/>\n";
    }

    @Override
    public int getLength() {
        return 2129;
    }

    @Override
    public String toString() {
        return "Ison{}";
    }
}
