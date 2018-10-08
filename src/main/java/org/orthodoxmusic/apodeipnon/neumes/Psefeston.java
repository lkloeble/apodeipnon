package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Psefeston  extends Neume  {

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int currentXPosition) {
        this.xStart = currentXPosition;
        return "<path psefeston d=\"M" + currentXPosition + " -90 c-29 -28 37 -81 286 -230 359 -214 562 -274 862 -252 225 16 302 53 580 279 169 138 191 153 234 160 27 4 36 10 36 25 0 19 -7 20 -161 18 -130 -1 -168 -4 -194 -18 -19 -10 -98 -80 -177 -156 -123 -118 -157 -145 -226 -179 -92 -45 -157 -60 -261 -60 -220 1 -485 113 -829 351 -92 63 -133 80 -150 62z\"/>\n";
    }

    @Override
    public int getLength() {
        return 1800;
    }

    @Override
    public String toString() {
        return "Psefeston{}";
    }
}
