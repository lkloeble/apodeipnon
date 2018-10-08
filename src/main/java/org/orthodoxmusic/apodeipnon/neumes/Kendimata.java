package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Kendimata extends Neume {
    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int horizontalIndice) {
        return "M-148 212 c-45 -6 -66 -37 -108 -163 -29 -87 -43 -115 -67 -134 -44 -34 -29 -46 55 -45 127 2 127 2 165 99 47 124 83 198 99 204 7 3 13 12 13 19 0 22 -69 31 -157 20z M250 212 c-47 -7 -60 -26 -105 -153 -33 -94 -48 -125 -72 -144 -50 -39 -30 -49 80 -44 107 6 109 8 138 87 43 116 79 195 96 210 10 8 18 21 18 27 0 19 -79 28 -155 17z";
    }

    @Override
    public int getLength() {
        return 0;
    }
}
