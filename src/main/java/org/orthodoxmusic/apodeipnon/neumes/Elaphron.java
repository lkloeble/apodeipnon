package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Elaphron extends Neume {

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int currentXPosition) {
        this.xStart = currentXPosition;
        return "<path d=\"M" + currentXPosition + " 510 c-208 -30 -333 -139 -319 -275 6 -59 33 -119 69 -152 73 -68 357 -114 346 -56 -2 12 -23 20 -73 30 -59 10 -74 18 -97 45 -32 37 -42 80 -36 149 8 76 47 126 133 169 67 34 74 35 175 34 67 0 131 -7 175 -18 158 -41 446 -196 499 -269 19 -26 19 -30 5 -55 -8 -15 -34 -38 -57 -50 -35 -20 -41 -27 -31 -38 10 -12 47 -14 202 -12 172 3 191 5 201 21 16 27 -32 65 -220 172 -386 220 -560 289 -769 305 -133 11 -129 11 -203 0z\"/>\n";
    }

    @Override
    public int getLength() {
        return 1200;
    }
}
